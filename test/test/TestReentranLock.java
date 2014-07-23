package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TestReentranLock {
	public static void main(String[] args) throws InterruptedException {
		  new TestReentranLock().method2();
		}
	
	public void method1(){
		final ExecutorService exec = Executors.newFixedThreadPool(4);
		  final ReentrantLock lock = new ReentrantLock();
		  final Condition con = lock.newCondition();
		  final int time = 5;
		  final Runnable add = new Runnable() {
		    public void run() {
		      System.out.println("Pre " + lock);
		      lock.lock();
		      try {
		    	
		        con.await(time, TimeUnit.SECONDS);
//		    	  Thread.sleep(5000);
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      } finally {
		        System.out.println("Post " + lock.toString());
		        lock.unlock();
		      }
		    }
		  };
		  for(int index = 0; index < 4; index++)
		    exec.submit(add);
		  exec.shutdown();
	}
	
	public void method2(){
		final ExecutorService exec = Executors.newFixedThreadPool(4);
		  final ReentrantLock lock = new ReentrantLock();
		  final Condition con = lock.newCondition();
		  final int time = 5;
		  final Runnable add = new Runnable() {
			    public void run() {
			      System.out.println("Pre " + lock);
			      lock.lock();
			      //lock.lock();
			     
			      try {
			    	  System.out.println(lock.getHoldCount());
			        con.await(time, TimeUnit.SECONDS);//await will release the lock
//			    	  Thread.sleep(5000); //but Thread.sleep will not release the lock
			      } catch (InterruptedException e) {
			        e.printStackTrace();
			      } finally {
			        System.out.println("Post " + lock.toString());
			        lock.unlock();
			        
			        //lock.unlock();
			      }
			    }
			  };
		  
		  for(int index = 0; index < 4; index++)
			    exec.submit(add);
			  exec.shutdown();

	}
}

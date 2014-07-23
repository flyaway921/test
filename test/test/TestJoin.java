package test;

import java.util.ArrayList;
import java.util.List;

public class TestJoin {
	public static void main(String[] args) {
		final List threads = new ArrayList();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
//				threads.add(0,Thread.currentThread());
				System.out.println("this is thread1");
				System.out.println("this is thread1");
				
				try {
					Thread.sleep(900);
					((Thread) threads.get(1)).join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("this is thread1");
				System.out.println("this is thread1");
				
			}
		});
		threads.add(0, t1);
		t1.start();
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
//				threads.add(1, Thread.currentThread());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("this is thread2");
			}
		});
		threads.add(1, t2);
		t2.start();
	}
}

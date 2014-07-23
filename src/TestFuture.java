import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestFuture {
	
	public TestFuture(){
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		new TestFuture().method2();
	}

	public void method2(){
		Runnable r = new Runnable(){

			@Override
			public void run() {
				method();
			}
			
		};
		
		FutureTask future = new FutureTask(r,null);
		Thread thread = new Thread(future);
		thread.start();
		System.out.println("before get");
		try {
			future.get();
			System.out.println("after get");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of the method2");
		
		
		
	}
	
	
	
	private void method(){
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of method");
	}

}

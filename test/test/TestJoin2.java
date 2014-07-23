package test;

public class TestJoin2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" thread1");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" thread2");
			}
		});
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" thread3");
			}
		});
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();

		thread3.start();
	}
		
		
		
}

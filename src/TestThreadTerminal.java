
public class TestThreadTerminal {
	static boolean flag = true;
	public static void main(String[] args) {
		
		InnerThread innerThread = new InnerThread();
		Thread thread = new Thread(innerThread);
		thread.start();
		try {
			Thread.sleep(5000);
			thread.interrupt();
			System.out.println("interrupted");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("after interrupted");
			TestThreadTerminal.flag = false;
		}
		
	}
}

class InnerThread implements Runnable {

	@Override
	public void run() {
		while (TestThreadTerminal.flag) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					while(TestThreadTerminal.flag){
						System.out.println("***");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			});
			thread.start();
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("logggg");
				TestThreadTerminal.flag = false;
			}
			
		}
		
	}

}

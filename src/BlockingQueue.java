import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {
	// public ArrayBlockingQueue<Integer> queue = new
	// ArrayBlockingQueue<Integer>(30000);
	public ArrayList<Integer> queue = new ArrayList<Integer>(30000);

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue instance = new BlockingQueue();
		instance.queue.add(new Integer("1"));
		System.out.println(instance.queue.get(0));

		for (int i = 0; i < 10; i++){
			instance.method1(instance.queue);
			instance.method2(instance.queue);
		}

		Thread.sleep(5000);
		System.out.println(instance.queue.get(0));
	}

	public void method1(ArrayList<Integer> queue2) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					BlockingQueue.this.queue.set(0, new Integer("2"));
					System.out.println();
				}
			}
		}).start();
	}

	public void method2(ArrayList<Integer> queue2) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					BlockingQueue.this.queue.set(0, new Integer("3"));
				}
			}
		}).start();
	}

}

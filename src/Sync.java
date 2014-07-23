import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;


public class Sync {
//	public static int i = 0;
	public static AtomicInteger i = new AtomicInteger(0);
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println(i);
		
		ArrayList<FutureTask> tasks = new ArrayList<FutureTask>(10000);
		for(int i = 0; i < 10000; i++){
			 FutureTask task = new FutureTask(new Runnable() {
				@Override
				public void run() {
					Sync.incrementI();
				}
			}, null);
			
			new Thread(task).start();
			tasks.add(i,task);
		}
		
		for(int i = 0; i < 10000; i++){
			tasks.get(i).get();
		}
		
		System.out.println(i); 
	}
	
	public static void incrementI(){
		for(int i =0 ;i<1000;i++)
			Sync.i.incrementAndGet();
//			Sync.i ++;
	}
	
}

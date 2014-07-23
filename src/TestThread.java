import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class TestThread {

//    public volatile static int count = 0;
    public static AtomicInteger count = new AtomicInteger(0);


    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(5000);
        for (int i = 0; i < 5000; i++) {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    TestThread.inc();
                    latch.countDown();
                }
            }).start();
        }
        latch.await();
        System.out.println("count : " + TestThread.count);
        // Thread.sleep(2000);
        // MyThread2 t = new MyThread2();
        // t.start();
    }

    protected static void inc() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//        count++;
//        count.addAndGet(1);
        count.getAndIncrement();
    }
}

public class TestSleep {
public static void main(String[] args) {
	System.out.println(System.currentTimeMillis());
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(System.currentTimeMillis());
}
}

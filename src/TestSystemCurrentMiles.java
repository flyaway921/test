
public class TestSystemCurrentMiles {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(start);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println(end-start);
	}
}

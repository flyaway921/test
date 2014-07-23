import java.util.Date;


public class TestBoolean {
	Date d;
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		short x = 7;
		short y = 4;
		System.out.println(a&&b);
		System.out.println((x&y));
		System.out.println(~x);
		System.out.println(!a);
		
		int g = 5;
		int h = 7;
		System.out.println(Integer.toBinaryString(g));
		System.out.println(Integer.toBinaryString(~g));
	}
}

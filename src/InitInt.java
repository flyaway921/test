/**
 * int init value is 0 if not inited
 * String init value is null if not inited
 * @author root
 *
 */

public class InitInt {
	private int i;
	private String s;
	public static void main(String[] args) {
		InitInt instance1 = new InitInt();
		InitInt instance2 = new InitInt();
		System.out.println(instance1.i);
		System.out.println(instance1.s);
		System.out.println(instance2.i);
		System.out.println(instance2.s);
		
	}

}

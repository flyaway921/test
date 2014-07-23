
public class ContinueTest {
	public static void main(String[] args) {
		int a =0;
		int b =0;
		for( ; a <10; a ++)
		{
			if( a == 5)
			{
				System.out.println(a);
				continue;
			}
			System.out.println("a is "+a);
			
		}
		System.out.println("a:"+a+" b:"+b);
		
	}
}

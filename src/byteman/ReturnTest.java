package byteman;

public class ReturnTest {
	public static void main(String[] args){
		try{
		  Thread.sleep(20000);
		}catch (Exception e){
		  e.printStackTrace();
		}
		  System.out.println("before method");
		  boolean b = new ReturnTest().method();
		  System.out.println("after method");
		  System.out.println("the value of b is: "+b);
	}
	
	public boolean method(){
		return true;
	
	}
}

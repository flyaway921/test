package byteman;

public class ReturnTest2 {
	public static void main(String[] args){
		try{
		  Thread.sleep(20000);
		}catch (Exception e){
		  e.printStackTrace();
		}
		  System.out.println("before method");
		  boolean b = new ReturnTest2().method(true);
		  System.out.println("after method");
		  System.out.println("the value of b is: "+b);
	}
	
	public boolean method(boolean t){
		return t;
	
	}
}

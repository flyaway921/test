package byteman;

public class AfterWrite{
	public int member;
	public static void main(String[] args){
	 try{
	  Thread.sleep(20000);
	}catch (Exception e){
		e.printStackTrace();
	}
	  System.out.println("before method");
	  new AfterWrite().method();
	  System.out.println("after method");
	}
	
	public void method(){
		final int current;
		System.out.println("this is method");
		current=10;
		this.member=20;
	
	}
}

package byteman;

public class KillJvm{
	public static void main(String[] args){
	 try{
	  Thread.sleep(20000);
	}catch (Exception e){
		e.printStackTrace();
	}
	  System.out.println("before method");
	  new KillJvm().method();
	  System.out.println("after method");
	}
	
	public void method(){
		System.out.println("this is method");
	}

}

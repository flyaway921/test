package exception;

import java.io.IOException;

public class TestException {
	public static void main(String[] args) {
		
		System.out.println("method return :"+new TestException().method());
		
		System.out.println("exit");
		
		
		
	}
	
	
	public boolean method(){
		boolean b = false;
		try{
			b = true;
			throw new IOException();
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		return b;
	}

}

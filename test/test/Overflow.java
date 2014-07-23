package test;

public class Overflow {
	
	public static void main(String[] args) {
		int i =1;
		for(int j =0 ;j<31;j++)
			i=i*2;
		System.out.println(i);
	}
}

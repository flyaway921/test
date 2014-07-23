import java.util.Scanner;


public class DynamicPara {
	static final Scanner cin=new Scanner(System.in);
	public static void main(String[] args) {
		String[] s = new String[10];
		while(cin.hasNext()){
			String temp = cin.nextLine();
			new DynamicPara().method(temp);
		}
	}
	
	public void method(String ...strings){
		for(String s:strings){
			System.out.println(s);
		}
	}
}

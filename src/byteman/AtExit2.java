package byteman;

public class AtExit2{
	public static void main(String[] args){
		AtExit2 test = new AtExit2();
		System.out.println("local boolean is assigned true, but the output value is "+test.method());
}
	public boolean method(){
		boolean localBoolean=true;
		return localBoolean;
	}
}

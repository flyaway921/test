package byteman;

public class AtExit{
	public static void main(String[] args){
		AtExit test = new AtExit();
		System.out.println("local int is assigned 10, but the output value is "+test.method());
}
	public int method(){
		int localInt=10;
		return localInt;
	}
}

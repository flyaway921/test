package package2;

public class PkgTest2 {
	public PkgTest2(){
		System.out.println("i am PkgTest2");
	}
	void speak(){
		System.out.println("i am from package1 , i am friendly method");
	}
	protected void talk(){
		System.out.println("a am from package1 , i am protected method");
	}
	
	private void talkPrivate(){
		System.out.println("a am from package1 , i am private method");
	}
}

package package3;

import package2.PkgTest2;

public class PkgTest3 extends PkgTest2{
	public PkgTest3(){
		super();
		System.out.println("i am PkgTest3");
	}
	public void com(){
		talk();
	}
	public static void main(String[] args) {
		new PkgTest3();
	}
}

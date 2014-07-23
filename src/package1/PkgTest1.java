package package1;

import package2.PkgTest2;

public class PkgTest1 {
	public void speak(){
		System.out.println("i am from package1");
	}
	public static void main(String[] args) {
		new PkgTest2();
	}
}

package test;

public class TestInstanceof {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		System.out.println(b instanceof A);
		
	}

}

class A{
	public A(){
		System.out.println("this is A");
	}
}
class B extends A {
	
	public B(){
		System.out.println("this is B");
	}
}

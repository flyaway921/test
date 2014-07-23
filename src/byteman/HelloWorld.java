package byteman;

public class HelloWorld {
	private B b= new B();
	public static void main(String[] args) {
		HelloWorld myWorld = new HelloWorld();
		myWorld.sayHello();
		myWorld.method();
	}
	public void sayHello(){
		System.out.println("hello!");
	}
	public void method(){
		System.out.println(HelloWorld.this);
		b.method(this);
	}
	
	class B{
		public void method(HelloWorld h){
			h.sayHello();
		}
	}
}

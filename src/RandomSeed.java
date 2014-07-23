import java.util.Random;

public class RandomSeed {

	public static void main(String[] args) {
		RandomSeed seed = new RandomSeed();
//		seed.method1(10);
//		System.out.println("###############");
//		seed.method1(1111);
		seed.method4();
		System.out.println("###################");
		seed.method4();
	}

	public void method1(int i) {
		System.out.println(new Random(21L).nextInt(i));
		System.out.println(new Random(22L).nextInt(i));
	}

	public void method2(int i) {
		System.out.println(new Random(21L).nextInt(i));
		System.out.println(new Random(22L).nextInt(i));
	}
	
	
	public void method3(int i){
		Random r = new Random();
		System.out.println(r.nextInt(i));
	}
	
	public void method4(){
		Random r = new Random();
		for(int i = 0; i < 10 ; i ++)
			System.out.println(r.nextInt());
	}

}

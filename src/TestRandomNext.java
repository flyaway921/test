import java.util.Random;


public class TestRandomNext {
	public static void main(String[] args) {
		Random random  = new Random();
		for(int i =1;i<30;i++)
			System.out.println(random.nextInt(i));
	}
}

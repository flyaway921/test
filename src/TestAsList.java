import java.util.Arrays;
import java.util.List;


public class TestAsList {
	public static void main(String[] args) {
		List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
		for(String s:stooges){
			System.out.println(s);
		}
	}
}

import java.text.MessageFormat;


public class StringFormat {
	public static void main(String[] args) {
		System.out.println(MessageFormat.format("{0} is a {1}", "tiger","animal"));
		System.out.println(String.format("{0}%s is a {1}%s", "tiger","animal"));
	}

}

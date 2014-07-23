package test;

public class TestSpilt {
	public static void main(String[] args) {
		String my = "Keyspace1-Standard1-job1.db";
		String[] result = my.split("-");
			System.out.println(result[0]);
	}
}

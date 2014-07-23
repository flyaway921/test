import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;


public class TestBuffer {
	public static void main(String[] args) {
		ByteBuffer bf;
		bf=ByteBuffer.wrap("abcd".getBytes());
		System.out.println(new String(bf.array()));
		Arrays array;
		List list;
	}

}

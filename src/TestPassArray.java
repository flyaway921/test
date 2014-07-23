/*
 * array pass a pointer but int pass an value.
 * 
 */
public class TestPassArray {
	public static void main(String[] args) {
		int[] array = {2,3,4,5,6};
		method(array);
		method2(array[0]);
		System.out.println(array[0]);
	}
	
	public static void method(int[] array){
		array[0] = 1;
	}
	public static void method2(int i){
		i = 10;
	}

}

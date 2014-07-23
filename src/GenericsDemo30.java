public class GenericsDemo30 {
	public static void main(String args[]) {
		Integer[] array = {1,2,3,4,5,6};
//		Integer i[] = fun1(1, 2, 3, 4, 5, 6); // 返回泛型数组
		Integer i[] = fun1(array);
		fun2(i);
		System.out.println(returnType("string"));
	}

	public static <T> T[] fun1(T[] arg) { // 接收可变参数
		return arg; // 返回泛型数组
	}

	public static <T> void fun2(T param[]) { // 输出
		System.out.print("接收泛型数组：");
		for (T t : param) {
			System.out.print(t + "、");
		}
	}
	
	public static <T> Object returnType(T t)
	{
		return t.getClass();
	}
};
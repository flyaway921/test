
public class ChangeINt {
	public static void main(String[] args) {
		ChangeINt obj = new ChangeINt();
		String example = "aaa";
		obj.changeString(example);
		System.out.println(example);
		
		
		
	}
	public void changeInt(int value){
		value = 2;
	}
	public void changeString(String value){
		value = "bbb";
	}
}

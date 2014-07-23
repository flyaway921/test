package byteman;

public class Speaker {
	public String str="abc3defg";
	
	public void speak(String me,String someone){
		System.out.println(me+" say hello to "+someone);
	}

	public static void main(String[] args) {
		Speaker a = new Speaker();
		char res=a.str.charAt(2);
		System.out.println("char at 2 is"+res);
		a.speak("Tom", "Jerry");
		System.out.println("exiting...");
	}

}

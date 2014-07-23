
public class PassingValue {
	int i = 10;
	public static void main(String[] args) {
		PassingValue p = new PassingValue();
		p.change();System.out.println(p.i);
	}
	public void change(){
		this.i = 20;
	}
}

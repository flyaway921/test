package jvm;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class TestHeap {
	static List<Date> list = new ArrayList<Date>(10000000);
 
	public static void main(String[] args) {
		for(int i = 0;i<5000000;i++){
			 list.add(new Date(Date.UTC(2014, 6, 20, 16, 12, 1)));
		}
		try {
			Thread.sleep(1000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

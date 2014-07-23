package passValue;

public class Test1 {
    public static void main(String[] args) {
     String s = new String("aaa");
     System.out.println(s.hashCode());
     System.out.println("Before change, s = " + s);
     changeData(s);
     System.out.println("After changeData(n), s = " + s);
 }
   
    public static void changeData(String str) {
        str = new String("bbb");
    	System.out.println(str.hashCode());
 }
} 

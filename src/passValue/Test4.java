package passValue;

public class Test4 {
    public static void main(String[] args) {
     StringBuffer sb = new StringBuffer("Hello ");
     System.out.println("Before change, sb = " + sb);
     changeData(sb);
     System.out.println("After changeData(n), sb = " + sb);
 }
   
    public static void changeData(StringBuffer strBuf) {
        StringBuffer sb2 = new StringBuffer("Hi ");
        strBuf = sb2;
        sb2.append("World!");
 }
} 


/*output:
Before change, sb = Hello 
After changeData(n), sb = Hello 

sb     -->Hello(@b1)
strBuf -->Hello(@b1)
sb2    --->Hi(@b2)

after "strBuf = sb2 "
sb     -->Hello(@b1)
strBuf -->Hi(@b2)
sb2    --->Hi(@b2)

after "sb2.append("Hello!")
sb     -->Hello(@b1)
strBuf -->Hi World(@b2)
sb2    --->Hi World(@b2)

*/
package byteman;

    public class LocalVar {  
        public static void main(String[] args){  
              System.out.println("before method");  
              boolean b = new LocalVar().method();  
              System.out.println("after method");  
              System.out.println("the value of b is: "+b);  
        }  
          
        public boolean method(){  
            boolean b = true;  
            return b;  
        }  
    } 

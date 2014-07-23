import java.io.IOException;

    public class LocalVar {  
        public static void main(String[] args) throws IOException{  
              System.out.println("before method");  
      
              boolean b = new LocalVar().method();  
      
              System.out.println("after method");  
              System.out.println("the value of b is: "+b);  
        }  
          
        public boolean method() throws IOException{  
            boolean bb = true;  
            return bb;  
        }  
    }  

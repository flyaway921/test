package test;

public class TestStackTrace {
	public static void main(String[] args) {
		printStackTrace(TestStackTrace.class);
	}
	
	 public static void printStackTrace(Class cls) {
	        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
	        StringBuffer buf = new StringBuffer();
	        for(int i=0; i<elements.length; i++) {
	         buf.append("\n    "
	           + elements[i].getClassName()
	           + "."
	           + elements[i].getMethodName()
	           + "("
	           + elements[i].getFileName()
	           + ":"
	           + elements[i].getLineNumber()
	           + ")");
	        }
	        System.out.println(buf.toString());
	 }
}

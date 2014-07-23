
public class SecurityManagerTest {
	public static void main(String[] args) {
		
		SecurityManager sm=new SecurityManager();
		System.setSecurityManager(sm);
		
		if(sm!=null){
		    System.setSecurityManager(null);
		}
//		System.getProperty("java.security.manager");
	}
}

import java.rmi.Naming;
import java.rmi.RMISecurityManager;


public class DirectoryClient {

	public static void main (String[] args) {
		Directory directory;
		try {
  		        System.setSecurityManager(new RMISecurityManager());
  		      directory = (Directory)Naming.lookup("rmi://localhost/ABC");
			String[] information=directory.getAdress();
			System.out.println("Name is :"+information[0]);
			System.out.println("Address is :"+information[1]);
 
			}catch (Exception e) {
				System.out.println("DirectoryClient exception: " + e);
				}
		}
}

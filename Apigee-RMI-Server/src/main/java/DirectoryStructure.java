


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
	
/**
 * Adding the address and name in directory and getting the details back also at
 * the same time writing the details into a properties file.
 *
 */
public class DirectoryStructure {
	public static void main(String[] args) {

		System.setSecurityManager(new RMISecurityManager());
		DirectoryOperations directoryOperations;
		try {
			directoryOperations = new DirectoryOperations();

			Naming.rebind("rmi://localhost/ABC", directoryOperations);

			directoryOperations.addAddess("Anand J. Kadhi",
					"P.no.195 Narayan Apartment ramnagar nagpur");
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

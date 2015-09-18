import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Directory extends Remote {

	public void addAddess(String name, String address) throws RemoteException;
	
	public String[] getAdress() throws RemoteException;
}



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Properties;

public class DirectoryOperations extends UnicastRemoteObject implements
		Directory {

	protected DirectoryOperations() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Write the name and address into a properties file
	 * 
	 * @param name
	 * @param address
	 */
	public void addAddess(String name, String address) {
		Properties prop = new Properties();
		OutputStream output = null;

		try {

			output = new FileOutputStream("config.properties");

			// set the properties value
			prop.setProperty("user.name", name);
			prop.setProperty("user.address", address);

			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	public String[] getAdress() {

		Properties prop = new Properties();
		InputStream input = null;
		String[] information = new String[2];
		try {

			input = new FileInputStream("config.properties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			information[0] = prop.getProperty("user.name");
			information[1] = prop.getProperty("user.address");

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return information;
	}

}

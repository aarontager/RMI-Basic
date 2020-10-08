package edu.touro.mco243;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements CustomRMI {
	@Override
	public String testRMICall() throws RemoteException {
		return	"This is a simple example of Java's RMI implementation.\n" +
				"Notice how this method is in the server class yet called from the client object.";
	}

	public static void main(String[] args) {
		try {
			Server server = new Server();
			CustomRMI rmi = (CustomRMI) UnicastRemoteObject.exportObject(server, 100);
			Registry registry = LocateRegistry.createRegistry(100);
			registry.bind("RMI Test", rmi);
			System.out.println("Server Ready!");
		}
		catch(Exception ex) {
			System.err.println(ex.toString());
		}
	}
}

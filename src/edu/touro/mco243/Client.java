package edu.touro.mco243;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry(100);
			CustomRMI rmi = (CustomRMI) registry.lookup("RMI Test");
			System.out.println(rmi.testRMICall());
		}
		catch(Exception ex) {
			System.err.println(ex.toString());
		}
	}
}

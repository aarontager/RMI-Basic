package edu.touro.mco243;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CustomRMI extends Remote {
	String testRMICall() throws RemoteException;
}

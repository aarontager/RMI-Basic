package edu.touro.mco243;

public class Main {
	public static void main(String[] args) {
		System.out.println("Starting server...");
		Server.main(null);
		System.out.println("Running client test...");
		Client.main(null);
		System.exit(0);
	}
}

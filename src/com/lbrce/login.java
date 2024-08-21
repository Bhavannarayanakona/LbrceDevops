package com.lbrce;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		 String correctUsername = "user";
	     String correctPassword = "password";
	     Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter your Username: ");
	     String username = scanner.nextLine();
	     System.out.print("Enter your Password: ");
	     String password = scanner.nextLine();
	     if (username.equals(correctUsername) && password.equals(correctPassword)) {
	         System.out.println("Login successful!");
	     } else {
	         System.out.println("Invalid Username or Password. Please try again.");
	     }
	     scanner.close();
	}

}

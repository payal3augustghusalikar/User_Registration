package com.userregistration;

import java.util.Scanner;

public class UserRegistration {
	
	static UserRegistration validationProcess = new UserRegistration();
	Scanner scanner = new Scanner(System.in);
	static int loop = 0; 
	
	public static void main(String[] args) {
		System.out.println("********* Welcome to User Registration process **********");
		
		validationProcess.firstName();
		validationProcess.lastName();
	}
	
	public void firstName() {
		
		while (loop == 0) {
			System.out.println("\nEnter your valid first name starting with capital letter and minimum 3 Character");
			String firstName = scanner.nextLine();
			String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
			
			if (firstName.matches(firstNamePattern)) {
				System.out.println("First name is valid");
				break;	
			}
			else 
				System.out.println("First name is invalid"); 
		}	
		System.out.println("---------------------------------");
	}
	
	public void lastName() {
		
		while (loop == 0) {
			System.out.println("\nEnter your valid Last name starting with capital letter and minimum 3 Character");
			String firstName = scanner.nextLine();
			String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
			
			if (firstName.matches(firstNamePattern)) {
				System.out.println("Last name is valid");
				break;
			}
			else 
				System.out.println("Last name is invalid"); 
		}
		System.out.println("---------------------------------");
	}	
	
}

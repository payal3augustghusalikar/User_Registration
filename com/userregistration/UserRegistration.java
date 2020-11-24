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
		validationProcess.email();
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
	
	public void email() {
		
		while (loop == 0) {
			System.out.println("\nEnter your valid email");
			String email = scanner.nextLine();
			String emailPattern = "^([a-z]{3,})([.]{0,1}[a-z]*)@([a-z]{2}).([a-z]{2})([.]{1}[a-z]{2}){0,1}$";
			
			if (email.matches(emailPattern)) {
				System.out.println("email is valid");
				break;	
			}
			else 
				System.out.println("email is invalid"); 
		}	
		System.out.println("---------------------------------");
	}
	
}

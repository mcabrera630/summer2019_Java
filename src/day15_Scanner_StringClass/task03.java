package day15_Scanner_StringClass;

import java.util.Scanner;

public class task03 {
	
	public static void main(String[] args) {
		
	
	/*
	 write a program that asks user to enter first name and then last name. At the end system should display full name.
	  
	  
	  
	 */
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter your first name: ");
	String firstName = input.nextLine();
	
	System.out.println("Enter your last Name: ");
	String lastName = input.next();
	
	String fullname = lastName + " " +firstName;
	System.out.println("Your full name is: " + fullname);
	
	
	
	}
}

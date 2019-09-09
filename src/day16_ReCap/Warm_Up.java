package day16_ReCap;

import java.util.Scanner; // imports one class

import java.util.*; // imports all classes from java.util

public class Warm_Up {
	
	
	
	/*
	 write a java program that asks user to enter first and last names, then printout the user's full name in all capital letters.
	 fullname: lastName firstName 
	  
	 */
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your first name and last name");
	String firstName = scan.nextLine(),//.toUpperCase(),
			lastName = scan.nextLine();//.toUpperCase();
	
	String fullName = firstName.concat( " "+lastName).toUpperCase();
			// fullName = fullName.toUpperCase();
	System.out.println("Your full name is: "+ fullName);
}
}

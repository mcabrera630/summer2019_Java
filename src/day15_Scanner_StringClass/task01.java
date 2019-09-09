package day15_Scanner_StringClass;

import java.util.Scanner;

public class task01 {
	
	public static void main(String[] args) {
		/* write a program that calculates the sum of two numbers entered by the user.
		  
		 */
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first number");
	int num1 = input.nextInt();
		
	System.out.println("Enter second number");
	int num2 = input.nextInt();
	System.out.println("the sum is: " +(num1+num2));
	

	
	}

}

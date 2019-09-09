package day15_Scanner_StringClass;

import java.util.Scanner; // imports scanner class only from java.util
import java.util.*; //imports all the classes from java.util

public class Scanner_Day15 {

	/*
	  package name : java.util 
	  class name : Scanner
	  
	  Scanner Class is used for reading user inputs 
	  Scanner class is present in "java.util" package
	  in order to use scanner, we MUST import it from its package:
	  					import java.util.Scanner;
	  					// imports scanner class only from the java.util' package
	  the import statement MUST be placed between class and package
	  
	  					package A;
	  					
	  					import java.util.Scanner;
	  					
	  					public class B{ }
	  wild import: 
	  			import java.util.*
	  			
	  		// imports all the classes within "java.util" package 
	  
	  Declaration of scanner class:
	  			Scanner variableName = new Scanner (System.in)
	  			
	  			variableName : can reference an object of scanner class
	  			
	  			new Scanner (system.in): creates an object from the scanner class
	  		 
	  		 Scanner Methods: 
	  		 			variableName.nextByte():
	  		 					returns the user input as byte value
	  		 			
	  					variableName.nextShort():
	  					 		returns the user input as a short value 
	  					 
	  					variableName.nextInt():
	  							returns the user input as a int value 
	  					
	  					variableName.nextLong():
	  							returns the user input as a long value 
	  					
	  					variableName.nextBoolean():
	  							returns the user input as a boolean value 
	  					
	  					variableName.nextFloat();
	  							returns the user input as a float value
	  					
	  					variableNume.nextDouble():
	  							returns the user input as a Double value
	 */
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter byte value");	
	byte num = input.nextByte();// returns the user input as a Byte value 
	
	
	System.out.println("Enter short value");
	short num2 = input.nextShort();
	
	System.out.println("Enter int value");
	int num3 = input.nextInt();
	
	System.out.println("Enter long value");
	long num4 = input.nextLong();
	
	System.out.println("Enter a boolean value");
	boolean result = input.nextBoolean();
	
	System.out.println("Enter float value");
	float num5 = input.nextFloat();
	
	System.out.println("Enter double value" );
	double num6 = input.nextDouble();
		
	System.out.println("Enter your first name");
			String str = input.nextLine();
		
		
	
	
	
	
}





}


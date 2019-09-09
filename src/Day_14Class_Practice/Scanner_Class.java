package Day_14Class_Practice;
import java.util.Scanner;
// this imports Scanner class only from java.util package
import java.util.*; 
// this imports 
// everything in scanner class is imported 

public class Scanner_Class {

	public static void main(String[] args) {
		// scanner: its a class that provides the methods to get user inputs 
		// Scanner Class presented in package "java.util" 
		// in order to use scanner class, the scanner class MUST be imported: 
		//        this is how your use sca               import java. util. scanner; 
		// declaration of Scanner:
		//             Scanner VariableName = new Scanner (System.in);
		// VariableName: can reference an object of the scanner class
		
		// new Scanner (System.in) : created the object of the scanner class
		// methods of scanner: 
		//                 VariableName.nextByte(): 
		//                                  allows used to enter Byte value 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Byte Value");
		byte byteNum = input.nextByte();
		
		System.out.println("You have entered :" + byteNum);
		System.out.println("Enter another Byte value ");
		byte byteNum2 = input.nextByte();
		System.out.println("You have entered :" + byteNum2);
		System.out.println("Addition is: " + (byteNum + byteNum2));
		
		
		
		
		

	}
	
}

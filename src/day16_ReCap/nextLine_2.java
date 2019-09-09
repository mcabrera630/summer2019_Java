package day16_ReCap;

import java.util.Scanner;

public class nextLine_2 {
	
	 public static void main(String[] args) {
		
	/* write a program that accepte zip-code, city, state, phone number and 
	 then display all those gathered information
	 */
	 
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter your zip-code: ");
	int zipcode = input.nextInt();
	input.nextLine();
	 
	System.out.println("please enter your city name");
	String cityname = input.nextLine(); 
	
	System.out.println("zip code is: "+ zipcode);
	System.out.println("city name is: "+ cityname);
	
	System.out.println("Enter your phone number: ");
	int pn = input.nextInt();
	System.out.println("Enter state name");
 String stateName = input.nextLine();	
	System.out.println("");
	 
	 

}

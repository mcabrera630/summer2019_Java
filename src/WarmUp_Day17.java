import java.util.Scanner;

public class WarmUp_Day17 {

	public static void main(String[] args) {
		
	System.out.println("Enter first and last name: ");
Scanner scan = new Scanner(System.in);
String firstName = scan.nextLine();
String lastName = scan.nextLine();
String fullName = firstName.concat(" " + lastName); 
      int num1 = fullName.length();

System.out.println(fullName+" contains " +num1 + " characters");





	
	}	
}

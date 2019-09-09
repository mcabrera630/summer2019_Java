package day16_ReCap;
import java.util.Scanner;

public class nextLine {
 public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter your phone number and name");
	 //1232344 ENTER
	int pn =scan.nextInt();		
		scan.nextLine();
	String name = scan.nextLine();
	 // nextLine will take everything in scanners's memory (including "Enter" up to the new line
	 // nextLine9) method will take everything in scanners memory 
 }
}

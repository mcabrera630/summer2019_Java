package day12_SwitchStatements;

public class Review_ {

	/*
	 * Declare 3 numbers if n1 and n2 are equal ==n1&n2 are equal if n2 and n3 are
	 * equal == n2&n3 are equal if n3 and n1 are equal ==n3&n1 are equal if all
	 * equal == all equal
	 * 
	 * if none of them are equal == none of them are equal Do not use single if
	 * statement
	 */

	public static void main(String[] args) {
		
	
		int n1 = 3;
		int n2 = 5;
		int n3 = 3;
		
		
		if  (n1 == n2 && n2 == n3)
		{
			System.out.println("all are equal");
		}
		else if (n1 == n2) 
		{
			System.out.println("Then n1 and n2 are equal");
		}
		else if  (n2 == n3) 
		{
			System.out.println("Then n2 and n3 are equal");
		}
		else if (n3 == n1) {
			System.out.println("Then n1 and n3 are equal");
		}
		else {
			System.out.println("all are unequal");
}
	
	
	//Task 02 Nested if 
		int A = 20 , B = 20, C = 20;
		
		if (A==B && B==C) {
			System.out.println("All are equal");
		}else
			if (A==B) {
				System.out.println("A and B are equal");
		}
		else if (A==C) {
				System.out.println("A and C are equal");
		}
		else if (B==C) {
			System.out.println("B and C are equal");
		}
		else {
			System.out.println("None of them are equal");
		}
	
	
	
		int grade = 70;
		if (grade >= 0 && grade <= 100) {
		if (grade >= 60) {
			
			if (grade >=90) {
				System.out.println("A");
			}
			else if (grade >= 80) {
				System.out.println("B");
			}
			else if (grade >= 70) {
				
			System.out.println("C");
			} 
			else { 
				System.out.println("D");
			}
			
		}else {
			System.out.println("Failed");
		}
		}else 
			System.out.println("Error 404");
		
		
		
		
	
	}
			
	

}


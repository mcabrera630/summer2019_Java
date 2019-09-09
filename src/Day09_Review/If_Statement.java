package Day09_Review;

public class If_Statement {
	/*
	 * if Satements: single "If" statement:
	 * 
	 * if(boolean expression ){ // some codes to run only gets executed if that
	 * boolean expression is true if block only gets executed if the condition is
	 * true
	 * 
	 * 
	 */
	public static void main(String[] args) {
		if (10 > 9) { // only time this gets executed if the expression on this line is true otherwise
						// will be a dead code.
			System.out.println("Hello");
			System.out.println("Happy Friday");
			System.out.println("Tomorrow is day off");
			System.out.println(" class starts on Monday");

			int a = 1000;

			if (a++ == 1001) {
				// 1000 == 1001 ==> false
				a = 2000;
				System.out.println("a is increased");
			}

			System.out.println(a + "\n");

			int X = 987654320;
			if (X % 2 == 0)
				;
			{
				System.out.println(X);
				System.out.println(" it's an even number");
			}
			if (X % 2 != 0) {
				System.out.println(X);
				System.out.println("it's an odd number");

			}
			int Y = 23456789; 
			if ( Y % 5 == 0) {
				// 
				System.out.println(Y + " can be divided by 5");
			}
			if ( Y % 5 != 0 )
				System.out.println(Y + " can't be divided by 5");
		}
			String CEO = "Main Boss";
			String Kuzzat = "Main Boss";
			System.out.println(CEO == Kuzzat); // true
			
			if (Kuzzat == CEO) { 
				System.out.println("Great Person in the world");
				System.out.println( "First if block");
				if (Kuzzat != CEO) { 
					System.out.println( " Great Person in the world");
				}
				
				
				double TotalNumber =100;
				boolean Cybertek = true;
				boolean BestSchool = true;
				
				if (Cybertek == BestSchool) {
					TotalNumber += 500;
				}
				if (Cybertek != BestSchool) { 
					TotalNumber -= 50; 
				} 	
				
				System.out.println(TotalNumber);
				
				/* 
				  1. declare a variable, and initialize user age 
				  1. write a program if the user is eligible to vote for Donald Trump 
				          vote age: 18 
				 */
				byte PersonAage = 18;
				byte voteAge = 18; 
				if ( PersonAage >= voteAge ) {
					System.out.println(" Yes you are elgible to vote");
					System.out.println(" have fun with building the wall");
					System.out.println(" MAGA");
					
				if ( PersonAage < voteAge) { 
					System.out.println(" You are not eligible to vote yet, please grow up");
				}
				
				
				
				
				}
			
			
			}
			
			}

	}

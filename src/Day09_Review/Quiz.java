package Day09_Review;

public class Quiz {

	// Question 01
	public static void main(String[] args) {
		boolean a = !!!!!false; // 4 cancel each other out and will leave you with !false which equals true
		System.out.println(a);

		// Question 02

		boolean result = !false != ("Batch12" != "Best Batch Ever");
		System.out.println(result);

		// Question 03
		int x = 100;
		double y = x += 100 / 20;
		System.out.println(x);

		// Question 04
		boolean A = 128 > '9' || 128 == 127;
		System.out.println(A);

		// Question 06
		boolean StupidOperators = 10 >= 20 && 'a' > 'b';
		// false && false ==> false
		System.out.println(StupidOperators);

		// Question 07
		int num1 = 9999999;
		int num2 = 10;
		System.out.println(num1 * num2 / 10 % num1);

		// Question 09
		//int z = 100; 
		// System.out.println( "z > 100 is : " + H); // H is not defined before line 36 so there is a compile error
		
		System.out.println( "8" +5+7);
		System.out.println(5 + 7 + "8");
		System.out.println(5 + 7 + "8" +5 +7);
		
	System.out.println(1 + 11 + "3"); //anythign before the quotes will be added but then anything after that will become a text 
		
	// QUestion 12
	
		int numberA =100;
		 numberA += 300; 
		 System.out.println(numberA++ + " "+ numberA);
		 
		 // Question 13
		 
		 
		

	}

}

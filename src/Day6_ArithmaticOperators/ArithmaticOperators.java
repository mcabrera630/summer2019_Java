package Day6_ArithmaticOperators;

public class ArithmaticOperators {

	// password Starbuck1
	/*
	 * Arithmatic Operators
	 * 
	 * + : addition, adds two numbers together - : subtraction, subtracts a number
	 * from another : multiplication, multiplies / : division, divides % :
	 * remainder, returns the remainder from the division
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int a = 100;
		int b = a - 400; // -300;

		System.out.println(b);

		int c = a + b; // 100+ -300 = -200
		System.out.println(c);

		int X = 3, Y = 5, Z = X * Y;
		System.out.println(Z);

		int length = 100, Width = 10, Area = length / Width;
		System.out.println(Area);
		System.out.println(3 + 5 + 4 - 2);

		/*
		 * double resultNum = 9 / 0; System.out.println(resultNum); // will not compile
		 * because the denominator cannot be zero.
		 */

		double Number1 = 10 / 3f;
		System.out.println(Number1); // if you put an f after the 3 you will get more to the exact answer. If you
										// dont you will get a answer that is rounded. or you can just make either one
										// of those numbers with a decimal

		int output = 12 + 6 / 3;
		System.out.println(output);

		/*
		 * // % :
		 * 
		 * 10/3 ==> 3 with remainder of 1 12/5 ==> 2 with remainder (12 - (5*2)) = 2
		 */
		int result1 = 10 % 3; // 1

		System.out.println(result1);

		System.out.println(12 % 5); // 2

		/*
		 * 20, 45, 65, 67, 68 even: can be divided by 2 without a remainder odd: divided
		 * by 2, will have remainder
		 */

		int Number20 = 20 % 2;
		System.out.println(Number20); // even

		int Number45 = 45 % 2;
		System.out.println(Number45); // odd

		int Number65 = 65 % 2;
		System.out.println(Number65); // odd

		int Number67 = 67 % 2;
		System.out.println(Number67); // odd

		int Number68 = 68 % 2;
		System.out.println(Number68); // even

		/*
		 * first come first serve, except for VIP VIP: %, /, *
		 * 
		 */
		// GROUPING:

		System.out.println(1 + 2 - 2 + 3); // 4
		System.out.println(1 + 2 - (2 + 3)); // -2
	}
}

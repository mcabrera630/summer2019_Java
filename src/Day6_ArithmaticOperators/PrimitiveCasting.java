package Day6_ArithmaticOperators;

public class PrimitiveCasting {

	/*
	 * 
	 * casting: converting larger number or primitive to smaller size datatype
	 * varibalename = (datatype) value
	 * 
	 * castings : explicit and implicit
	 * 
	 * explicit testing is used when we are converting from a larger primitive to
	 * smaller type
	 * 
	 * int a=10; byte b=(byte)a;
	 * 
	 * implicit casting: Automatic casting from smaller primitive type into larger
	 * primitive type. ex: byte a= 10; int b= a; automatically casts
	 * 
	 * int c = (int) (int) will also work
	 * 
	 * local variables: variable are declared within the method LOCAL VARIABLES MUST
	 * BE INITIALIZED BEFORE BEING USED
	 * 
	 * Primitives: byte, short, int, long, float, double
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// EXPLICIT TESTING: has to be done manually

		int a = 10;
		// byte b=a; cant do it thats when you use casting
		byte b = (byte) a; // explicit casting

		System.out.println(b);

		// example:
		// int a= 128; cant assign this because the number cant be larger than 127

		double DecimalNumber = 10.5;
		// float FloatNumber= DecimalNumber; // Double > Float thats why you cant use
		// this double is larger than float
		float FloatNumber = (float) DecimalNumber;
		System.out.println(FloatNumber); // you can also assign this to int instead of the float

		long LongNum = 300L; // in this case we wanted to switch the variable and make the answer still 300

		int IntNum = (short) LongNum; // you can use byte short int on this example byte Value would change though

		System.out.println(IntNum);

		// IMPLICIT TESTING: is done by the compiler

		byte ByteNum = 100;
		int IntNum2 = ByteNum;
		int IntNum3 = (int) ByteNum; // converting smaller data to larger

		short ShortNum = 100;
		long LongNum2 = ShortNum;
		// same with:
		long LongNum3 = (long) ShortNum;

		// explicit casting practices:
		// double LargestNumber = 100.8765;

		// byte ByteValue = (byte) LargestNumber;

		// System.out.println(ByteValue); successful

		double LargestNumber = 100.8765;

		byte ByteValue = (byte) LargestNumber;

		float FloatValue = (float) LargestNumber;

		float FloatValue2 = (int) LargestNumber;
		float FloatValue3 = (byte) LargestNumber;
		float FloatValue4 = (short) LargestNumber;
		float FloatValue5 = (long) LargestNumber;

		float FloatNumber2 = 500.67F;

		int myNumber = (short) FloatNumber2;

		System.out.println(myNumber);

		System.out.println(FloatValue);

		/*
		 * int Num1=100; int Num2=200; int Num3=300;
		 */
		int Num1 = 100, Num2 = 200, Num3 = 300;

		int num1 = 100, num2 = 200, num3 = 300;

		boolean result = true;
		System.out.println(result); // local variables must be initialized

		char Character1 = 'a'; // in order to make it compile you must place in a character in this case 'a'
		System.out.println(Character1);

		boolean result1, result2, result3;

		// System.out.println(); all are errors because we have to give a variable to
		// each of them

	}
}

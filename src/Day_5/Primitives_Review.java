package Day_5;

import Day3_Variables.println_vs_print;

public class Primitives_Review {

	/*
	 * 
	 * Primitives:
	 * 
	 * Byte: only takes whole numbers Short: only takes whole numbers int: only
	 * takes whole numbers long: only takes whole numbers float: can take decimals
	 * (MUST have F or f at the end) double: can take decimals does not require a
	 * letter (used more often) boolean: true or false char: characters within
	 * single quote '' also takes numbers
	 * 
	 * 
	 * Range: double > float > long > int > short > byte
	 * 
	 * 
	 */
	public static void main(String[] args) {

		byte bNum = 127;

		// *** Java applications are executed top to bottom

		// byte range: -128 to 127

		// byte bNum2 = 126.5; //byte only takes whole numbers

		short sNum2 = 1000;
		// short sNum = 126.5; //short only takes whole numbers

		// bNum = sNum2; // cannot assign because short is greater than byte

		sNum2 = bNum;

		System.out.println(sNum2); // after this is computed total will be 127. sNum2 = 127

		short sNum3 = 127;
		// byte bNum5 = sNum3; // short > Byte

		int intNum = 100;
		// int intNum2 = 100.5 // int takes whole numbers

		// byte ByteNum = intNum; // int > byte
		// short ShortNum = intNum; // int > short

		short ShortNum2 = 105;
		intNum = ShortNum2;

		System.out.println(intNum); // 105

		long LongNum = 100l;
		long LongNum2 = 100L;

		// byte ByteNum3 =
		// short ShortNum4 =
		// int IntNum3 = 100L ; wont work long is greater that int, byte, short

		byte a = 10;
		int b = 30;
		short c = 40;

		long LongNumber = a;
		long LongNumber2 = b;
		long LongNumber3 = c;

		System.out.println();

		// float:

		float floatNumber = 10.5f;
		float floatNumber2 = 20.5F;

		short a1 = 10;
		byte b1 = 20;
		long c1 = 30;
		int d1 = 40;

		float Floats = a1;
		float Floats2 = b1;
		float Floats3 = c1;
		float Floats4 = d1;

		System.out.println(Floats); // 10.0;

		// double: takes all the primitives whole and decimal numbers
		double DoubleNum1 = 10L; // long is smaller than double so yes you can assign
		double DoubleNum2 = 10.5F;

		// boolean:

		boolean result = true;
		boolean result2 = false;

		boolean result3 = 9 > 10;

		// char: takes characters , char values MUST be declared within single character

		char character1 = 'A';
		System.out.println(character1); // character: A

		// char character2 = A; doesn't work
		// char character3 = 'AA' only a single character can be declared

		// all the characters have representive numbers

		char charvalue = 98;
		System.out.println(charvalue); // character.

		// ex: int num3 = 'B';
		// System.out.println( num3 ); //66

		// all numbers have their representive number

		float fnum = 'B';
		System.out.println(fnum); // 66.0

		byte bValue = 'B';
		System.out.println(bValue); // 66

		// float:
		float fnum2 = 5.5F;
		float fnum3 = 5;

		// char specialcharacter

		// practices:

		/*
		 * 
		 * 8, 9, #, @, 8.5, 5.5F, 128, 40000, 9>10, true, false
		 */

		// 8:
		/*
		 * byte Bnum =8; short SNum = 8; int INum= 8; long LNum = 8L; float FNum = 8;
		 * double DNum = 8; char character = 8;
		 * 
		 * /* System.out.println(Bnum); //8 System.out.println(SNum); //8
		 * System.out.println(INum); //8 System.out.println(LNum); //8
		 * System.out.println(FNum); //8.0 System.out.println(DNum); //8.0 //
		 * System.out.println(character); //8.
		 * 
		 */

		// # & @:

		// char character2 = '#';
		// char character3 = '@';

	}
}

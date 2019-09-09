package Day3_Variables;

public class PrimitiveDataTypes {

	private static final char[] dNum4 = null;

	/*
	byte: we can assign numbers that's no decimal (whole numbers) range is -128 to 127 
	short: we can only assign whole numbers. range of numbers must be in -32,768 to 32,767
	int: we can only assign within -2147483648 and 21447483649
	long: we can only assign whole number. Must be with in -9745874854738808 to 98394232678456807 at the end of value we can give l or L  
				
				
	
	float: we can assign decimals
			(must have f or F letter at the end)
			
	double: (used more often): we can assign 
	
				float < double 
	
				byte < short < int < long 
				small one can be assigned 
	*/
	
	public static void main(String[] args) {
		
		byte length = 3;
		
		System.out.println(length);
		
		byte width = 4;
		
		System.out.println(width);
		
		//byte 9num=100; variable names must start with a ~z or A ~Z
		
		byte num_and$ =90;
		
				
		// byte lenght =6; variable name is not unique 		
		
		// byte public =99; varibale names cannot be java reserved words
		
		// byte my Num1 = -129; out of byte' range so it will not compile 
		
		// byte my Num2 = 127; this will compile because it is within the range 
		
		// short num2 = & ;  this is wrong can only assign whole numbers
		
		// short num3 = 100,000 ; can't compile because it is above the range 
		
			int num4 = -100_000;
					
		// 100000000
		
			int num5 = 1_000_000_000; //easier to read (just like in accounting) 
			
			
			long longNumber =10l; 
			
		//	int intNumber =10l; will not work with letter at the end  
			
			byte byteNumber = 10; 
			short shortNumber = byteNumber;
			
			short shortNumber2 = 18;
		//	byte byteNumber2 = shortNumber2; short is greater than byte thats why we have an error
			
			int intNumber = -19876;
			long longNumber2 = intNumber; // long is greater than int
			
		// left side of the = has to be equal or greater than the right side of =
			
			short shortNumber3 = -30000;
			int intNumber2 = shortNumber3;
			
			System.out.println(shortNumber3);
			
			float example2 =10.5f; // the letter f needs to be aside from the decimal in order for the number to be recognized as a decimal 
			float example3 = 20.5f;
			
			double doubleNumber = 10.5; 
			double doubleNumber2 = example3;
			
		//	float floatNUmber = doubleNumber2; double datatype is larger than float data type
			
			byte bNum = 10;
			short sNum = 20;
			int iNum = 30;
			long lNum = 40;
			
			System.out.println(bNum);
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(lNum);
			
			System.out.println("===================");
			float fNum = bNum;
			float fNum2 = sNum;
			float fNum3 = iNum;
			float fNum4 = lNum; 
			
			System.out.println(fNum);
			System.out.println(fNum2);
			System.out.println(fNum3);
			System.out.println(fNum4);
			
			System.out.println("==================");
			double dNum = bNum; 
			double dNum2 = sNum;
			double dNum3 = iNum;
			double dNum4 = lNum;
			System.out.println(dNum);
			System.out.println(dNum2);
			System.out.println(dNum3);
	
			
			
			
			
			
			
		 
			
			
			
			
		
}
}

package Day07_Uneray_Shorthand;

public class Quiz {

	public static void main(String[] args) {

		// Question 01:

		int a = 30;
		// int b = (byte) a;
		int b = (short) a;
		System.out.println(b);

		// Question 03:
		System.out.print(" Result A " + 0 + 1);
		System.out.print("; Result B" + (1) + (2));

		System.out.println(" Result B" + (1 + 2));

		// Question04
		System.out.println("5 + 2 =" + 3 + 4);
		System.out.println("5 + 2 =" + (3 + 4));

		// Question 05

		float FloatNum = 100.98898090f;
		short ShortNum = (short) FloatNum; // 100
		System.out.println(ShortNum);

		// Questio06

		// byte BNum = 200; //byte' maximum capacity is 127

		int Numa = 200;
		int Numb = 2;
		System.out.println(a + b - a * b + a / b);
		// 200 + 2 - 400 + 100
		// 202 - 400 + 100
		// -98
		System.out.println((3 + 2) * 2 / 3 % 2);
		// 5 * 2 / 3 % 2
		// 10 / 3 % 2
		// 3 % 2
		// 1

		// Question07

		// int num1 = 9, num2 = 0, num3 = num1/num2;
		// System.out.println(num3);

		// QUestion09:

		long Lnum = 3_000L;
		double Dnum = (float) Lnum; // Narrowing
		int Inum = (short) Dnum; // int, short

		System.out.println(Inum % 1000);

		// Question 10

		double result1 = 10 / 3;
		// result1 = 3; ==> 3.0
		System.out.println(result1);

		// Question12:
		
		String str = "10.5"; // string of text 
		//int Num = (int) String // compile error because string is not a variable
		
		//Question13 
		int I1 =10 , I2 = 20, I3 = 30;
		I1 = I1 % 5;  // ==> 10 *5 = 0, I1 = 0 
		I2 = I2 % 5; // 20 % 5 = 0, I2= 0 
		I3 = I1 * I2; // I3= 0 
		
		System.out.println(I1+ "\t" + I2 + "\t" + "\t" + I3  );
				
				

	}

}

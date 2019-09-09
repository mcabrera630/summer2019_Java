package Welcome.java;

public class QuizReview {

	// Assessment Quiz02

	public static void main(String[] args) {

		int num = 198;
		System.out.println(num %= 2); // 0

		byte ByteNum = 30;
		// int Inum = Inum += ByteNum; compile error was giving because Inum was not
		// assigned, has no value
		// String str;
		// System.out.println(str); // no value was assign again so compile error will appear
		// 

		
		// question 01 
		int ivar = 100; 
		double dvar = 200; 
		float fvar = 300; 
	//	ivar = fvar; // float is greater than int thats why it does not compile 
		fvar = ivar; // it compiles 
		dvar = fvar;
		//fvar = dvar; does not compile 
		
		//question 02 
		String str1 ="Result A"+1+2; 
		System.out.println(str1);
		
		String str3 = "Result A" + 7 * 2;
		System.out.println(str3);
		
		//Question04 
		long L = 30L;
		long L2 = (short) L; 
		System.out.println(L2);
		
		
		
		
	
		System.out.println(10/3.0);
		
		
		
		
		
		
	}

}

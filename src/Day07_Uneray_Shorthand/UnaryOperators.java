package Day07_Uneray_Shorthand;

public class UnaryOperators {

	public static void main(String[] args) {
		/*
		 * 
		 * +: positive -: negative ++: increment -- : decrement
		 * 
		 * + - : negative - - : positive + + : positive - + : negative
		 * 
		 * -----------increment: increases the value by 1 increment are 
		  1.post increment: it will pass the current value first, 
		 * operator is placed after the variable ex: int IntNum = 100;
		 * system.out.println ( IntNum ++); 
		 * 100 system.out.println ( IntNum); // 101 
		 * int IntNum2 = IntNum ++; // IntNum2 =101
		 * IntNum2 = 101 
		 * system.out.println (intNum2) ;
		 * system.out.println (intNum2) ; // 102
		 * 
		 * int x = 100;
		 * int y = x++ - 1;
		 * 	   y + 100 - 1; 
		 * system.out.println (y)	
		 * 
		 * 2.pre increment: operator is placed before the variable; increases the value
		 * immediately ex: int a = 100; ++num1; system.out.println ( ++num1); answer
		 * will be 101 or num1 + 1
		 * 
		 * -----------decrement: decreases the value by 1
		 *  Pre-drecrement: operator is before the variable 
		 *  		decreases the value by 1 immidietly 
		 *  
		 *  int Z = 100; 
		 *      system.out.println (- - Z); // 99 
		 *      
		 *  post decrement: operator is placed after the variable 
		 *  // it will pass the currnet value first, and then decrement the 
		 *  
		 *  int Y = 95; 
		 *  system.out.println ( Y - -); // 95 
		 *  system.out.println (Y); //94
		 *  
		 *  int T = 25; 
		 *  system.out.println (++ T);// 26 
		 *  system.out.println (-- T);// 25 
		 *  
		 *  
		 * 
		 * 
		 * 
		 */

		//int a = 10;
		//int b = -10;
		//System.out.println(b);

		//int c = +b;// + (-10) ==> -10
		//System.out.println(c);

		//int d = -c; // - (-10) ==> 10
		//System.out.println(d);

		//int f = -(10);
		
		
		int a = 50; //49 // 50  //49   //50 
		
		//P= --P  +   P++  +   P-- +   P++;
		
		// pre     post      post    post 
		// 49   +   49   +   50   +   49
		
		// 49 * 3 + 50 
		
		// 197 
		
		short Snum= 4 ; // 3
		int R = Snum * 4 - Snum--;
			//	16 - 4 = 12
		System.out.println(R); //12
		System.out.println(Snum); //3
		
		int W = 1; //0 
			W = W-- + W++ / -W-- * --W ; 
			// post   post  post  pre 
			// -1   +  0  / -1  * -1 
			System.out.println(W); 
		
		// severity is decided by the testers team priority is discussed by developer and product owner 
		
	
			
			
	}

}

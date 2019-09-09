package Welcome.java;

public class RelationalOperators {
	
	/* 
	  Relational Operators: return boolean expression
	  
	  > : greater than 
	  >= : greater than or equal to 
	  < : less than 
	  <= : less than or equal to 
	  == : equal 
	  != : not equal 
	  
	  =: assign 
	  !: exclamation mark in java means the logical opposite
	  
	  
	  
	  
	 */

	public static void main(String[] args) {
	 System.out.println( 10 > 9 ); //true 
	 boolean resultA = 10 > 9; 
	 System.out.println( resultA );
	 
	 System.out.println(10 >= 9); // greater or equal 
	 
	 boolean resultB = 10 >= 9; 
	 System.out.println( resultB );
	 
	 boolean resultC = 10 <= 9;
	 System.out.println( resultC);
	 
	 boolean resultD = 1100 < 1200;
	 System.out.println( resultD );
	 
	 boolean resultE = 1000 < 1000; 
	 System.out.println( resultE );
	 
	 boolean resultF = 1000 <= 100; 
		 System.out.println( resultF );
		 
		 System.out.println("====================");
		 
		 boolean resultG = 19 == 19;
		 System.out.println( resultG );
		 
		 boolean resultH = 20 != 20;
		 System.out.println( resultH);
		 
		 boolean A = ! false; 
		 System.out.println(A); // ! is the opposite // answer true
		 
		 boolean B = !true ; // answer false 
		 System.out.println(B);
		 
		 /* 
		   
		  in java 
		   true == true, false == false 
		   ! false equal to true, !true equal to false 
		    
		   
		  */
		  System.out.println("=================");
		  
			boolean C = !false != !true;
			System.out.println(C );
			
			boolean D = true == !false;
			
			System.out.println(D);
			
			
			boolean h= "Batch12"== "Batch13";
			System.out.println(h);
			
			System.out.println( "batch12" == "Batch12");
			System.out.println("cybertek" != "club");
			System.out.println("Kuzzat" == "bad guy");
			System.out.println("Assistant teacher in class" != "Awesome");
			
			
			
}
}

package Welcome.java;

public class LogicalOperators {
	
	
	public static void main(String[] args) {
	
		/* &&: And logic true && true ==> if both conditions are true, answer will be true
		  
		  || : or logic  true || false ==> true 
		   				 true || true ==> true 
		   				 false || false ==> false 
		   				 if both conditions are false it will return false, other wise will return true 
		  
		  
		  
		  
		   */
		
		boolean ResultA = 9 ==0 && "Muhtar" == "good" ; 
		System.out.println( ResultA );
		//false && false ==> true 
		
		boolean ResultB = 8> 5 && 7 == (8-2+1); 
		// true && true ==> true 
		
		boolean ResultC = !false != true && !false ==!(!true); 
		// 					true != true && true == !false ==>
		//							false  &&  true ==> false 
		System.out.println(ResultC);
		
		System.out.println("==================");
		
		boolean A = "Monday" == "Funday" || 6==6;
		System.out.println(A);
		
		boolean B = true || false; // ==> true 
		System.out.println(B);
		
		boolean C = !( 8 > 5) || !("Today" != "friday");
		System.out.println(C);
		
		
		System.out.println("==================");
		
		boolean D = true && true || false ; 
		
		System.out.println(D);
		
		boolean E = !(7 > 5 && 6 != 5) && ( 9 > 5 || 10 > 4); 
				//		!true  &&  true , because it is using || if you are using that then even with just one the statement becomes true 
				//			false &&  true
		System.out.println(E);
		
		System.out.println(" I love you"); while (true);
		
	
		
	}

}

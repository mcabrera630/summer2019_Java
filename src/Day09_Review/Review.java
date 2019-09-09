package Day09_Review;

public class Review {
	
	/* 
	  
	 >  :  greater			only returns true when x > y ex: x = 10 y = 9 
	 >= :  greater than or equal to  true: when either greater or equal 
	 <  :  less than		only return true when Y < X  ex: X=10 Y=9
	 <= :  less than or equal to     true: either less or equal 
	 == :  equal            X=10 , Y=10, true: X==Y
	 != : not equal         X=9, x=10; true: x != y 
	  
     logical operators:
	 && :	true: if both conditions are true 
	 || : 	true: as long as one condition is true 
	  
	 */

	public static void main(String[] args) {
		System.out.println('z'>'a');
	System.out.println('Z' >= 'A');
	
	System.out.println(true == true && false != true); // true && true 
	System.out.println( true != true || false == true ); // false || false  ==> false because of the rule  
	
	System.out.println("monday" == "funday"); 
	
	
	
	
	} 

}

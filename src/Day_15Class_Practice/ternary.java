package Day_15Class_Practice;

public class ternary {
	public static void main(String[] args) {
		int num = 0;
		/*if (true) { 
			num = 100;
		else  
			num = 50;
		
		System.out.println(num);
	*/
		num = (true) ? 100 : 50; // ternary returns a Value
		System.out.println(num);
		
		int n = false ? 100 :50;
		int y = false ? 100 : 50;
	System.out.println(y);
System.out.println("===========================");	
	String Schoolname = "";
	boolean Batch12 = true;
	
	if (Batch12) { 
		Schoolname = "Cybertek";
	} else { 
		Schoolname = "invalid" ;
	}
	
	System.out.println( Batch12 ? "Cybertek" : "Invalid" );
	System.out.println("==================");
	String BestSchool = Batch12 ? "Cybertek" : "Invalid";
	System.out.println(BestSchool);
	
	double d = 10;
	if (true) { 
		d= 10.5;
		
	double z = true ? 10.5 : 0 ; 
	
	double interestRate = 0 ;
	boolean GoodCredit = true ;
	
	//changing to ternary statement 
	
	interestRate =(GoodCredit == true ) ? 0.5 : 0.9;
		System.out.println(interestRate);
		
	System.out.println("==================");	
	byte grade = 60;
	boolean Passed = grade >= 60 ? true : false ; 
	
	System.out.println(Passed);
	System.out.println("================");
	/*char FinalGrade = 'A';
	String Group = "";
	
	if (FinalGrade == 'A') {
		Group = "Early bird";
	}else if (FinalGrade == 'B') {
		Group = "Group 1";
	}else if{ 
		Group = "After Group 1";
	}else if (Final Grade == 'C') {
		Group = "Group 2";
	} else { 
		Group = "After Group 2" 
	}
	convert to ternary now 
	*/ 
	char FinalGrade = 'C';
	String Group = "";
	Group = FinalGrade == 'A' ? "Early bird" : FinalGrade == 'B' ? 
			"Group 1" : "After Group 2" ;
	System.out.println(Group);
	
	Group = FinalGrade == 'C' ? "Group 2" : "After Group 2";
	}
	System.out.println("=====================");
	
	int score = 80 ;
	char Finals = ' ';
	
	if (score >= 90 && score <= 100)
		Finals = 'A';
	else if (score >= 80 && score <= 89)
		Finals = 'B';
	else if (score >= 70 && score <= 79)
		Finals = 'C';
	else if (score >= 60 && score <= 69)
		Finals = 'D';
	else if (score >= 0 && score <= 59)
		Finals = 'F';
		else 
			Finals = ' '; 
	System.out.println(Finals);
	
	Finals = score >= 90 && score <= 100 ? 'A'
			: score >= 80 && score <= 89 ? 'B'
			: score >= 70 && score <= 79 ? 'C'
			: score >= 60 && score <= 69 ? 'D'
			: score >= 0 && score <= 59 ? 'F'
			: ' ';
			System.out.println(Finals);
			System.out.println("=====================");
			int n1 = 1000, n2= 300, n3 = 400;
			
			int max = ( n1 > n2 && n1 >n3 ) ? n1
					: ( n2 > n1 && n2 >n3 )? n2
						: n3;
			System.out.println(max);
			
			

	
	
	
	
	/*
	 
	  topic: Ternary & Scanner class
	  ternary: 
	  
	  else statement ||   ternary statement
	  
	  if (condition)		 ==> (condition)?
	  else 					 ==> : 
	  else if (condition)    ==> : (condition)?
	  =========================================
	  in ternary's body we can only give 
	  
	  
	 */
	
	
	
	
	}

}

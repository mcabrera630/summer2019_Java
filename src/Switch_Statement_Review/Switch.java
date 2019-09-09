package Switch_Statement_Review;

public class Switch {

	/*
	 * Switch statement Switch (expression) {
	 * 
	 * case CaseValue: 
	 * statement1; 
	 * statement2; 
	 * break; }
	 * 
	 * case CaseValue: 
	 * statement 1;
	 * statement 2; 
	 * break;
	 * 
	 * default: statement; statement;
	 * 
	 * we can have as many cases as you want caseValue Must match with the switch
	 * Expression' dataType
	 * 
	 * break statement:
	 * 
	 * used for exiting the switch statement. if we dont have break statement, code
	 * will continue to run till next break statement or curly brace } case is
	 * similar with else- if
	 * 
	 * default section is similar with else statement default is given when not case
	 * matches with given expression.
	 * 
	 * default section can be places any where with in switch statemnt
	 * 
	 * in switch statement, none of the blocks cases or defaults or statement are
	 * mandatory even the breaks.
	 */
	public static void main(String[] args) {

		int num = 5;
		switch (num) { 
		case 7 : 
			System.out.println("Sunday");
			break; // it's used for exiting switch statement after case is executed
		default:
			System.out.println("Invalid Entry");
			break;
		case 10-5: 
			System.out.println("Friday");
			break;
		}
		
		String days = "Tuesday";
		switch (days) {
		case "Monday":
			System.out.println("Monday is fun day");
			break;
		case "Tuesday": 
			System.out.println("Tuesday is great day");
			break;
		case "Wednesday":
			System.out.println("Wednesday is day off");
			break;
		default: 
			System.out.println("Invalid");
			break;
		}
	/* 
	  switch statements expression must be evaluate to a single value ( either characters,
	  digits, or text), therefore 4 dataTypes are not accepted: 
	  	double a = 10L, 10D, 10D;
	  	float a = 10F, 10f;
	  	long a = 10,10l, 10L
	  	boolean = true, false, 
	 */
		long N1 = 10;
		// switch (N1) {} 
		float N2 = (int) 100;
		//switch (N2) {}
		
		double N3 = 10; 
		// switch (N3) {  }
		boolean N4 = true; //9 < 8 
		//switch (N4) {}
		
		char ch = 'A';
		switch (ch) {}
		
		char ch2 = 123;
		System.out.println(ch2);
		
		// or logic 
		char grade = 'A';
		if (grade == 'A' || grade == 'B') { 
			System.out.println("Passed the exam");
		} else { 
			System.out.println("Failed");
		}
		switch (grade) {
		case 'A' :
			break;
		case 'B' :
		System.out.println("Passed the exam");
		break;
		
		default:
			System.out.println("failed the exam");
	}
		String US = "USA";
		if(US == "USA" || US == "America") {
			System.out.println("American");
		}else {
			System.out.println("Not American");
		}
		// how to convert if statement to switch 
		switch (US) {
		case "US" : 
		case "USA": 
		case "American": 
			System.out.println("American");
			break; // after each case you should place in a break  
			
		default: 
			System.out.println("Not American");
			
	}}}


package day12_SwitchStatements;

public class day12_SwitchStatement1 {
	public static void main(String[] args) {
		
			
		// nested if witout curly braces
		// without curly braces you can only use one row after the if statement or else second one did not print out because statement is labeled as true and not false. 
		
			if (true)
				System.out.println("Hello World");
			//System.out.println("hey");
			else 
				System.out.println("Hello Cybertek");
	
		// multi-branch if: 
			int grade =80;
			if (grade <= 100 && grade >= 0) {
			if (grade >= 90) {
				System.out.println("A");
			}else if (grade >= 80) {
				System.out.println("B");
			}else if (grade >=70) {
				System.out.println("C");
			}
	
			//without curly braces multi branch:
			if (grade <= 100 && grade >= 0)
			if (grade >= 90) System.out.println("A");
			else if (grade >= 80) System.out.println("B");
			else if (grade >= 70) System.out.println("C");
			else System.out.println(); // this else statement belongs to the else if statement that is how you close 
			else System.out.println("Invalid"); //this else statement belongs to the pre-condition
	
			System.out.println("==========================");
			
			/* Switch statement does the similar thing like the multi-branch
			  switch (Expression) {
			  	case caseValue: 
			  			statements1
			  			statements2
			  			break;  
			 */
			
			
			int score = 1;
					if (score == 1 ) // Must give boolean expression
					System.out.println("1");
			//ex: 
			switch (score) { // Must give an Expression: data 
			case 1:
				System.out.println("1");
			break;
			case 2:
			System.out.println("2");
			
			break;
			default: 
				System.out.println("Invalid");
			break;
			
		// 	break: closing statement => } exits the switch statement 
		// if there no break in switch, also keep in mind that the case order does not matter 
			}
			String str = "Java";
			
			switch (str) {
			default: 
				System.out.println("Invalid");
				
			case "C#": 
				System.out.println("C# programming Language");
				break; // case is closed because of the break that was written on this line it will execute everything above but nothing after, 
			case "Python":
				System.out.println("Python programming Language"); 
			}
			System.out.println("===========================");
			char grade1 = 'A';
			
			switch(grade1) {
			

			
			case 'B':
				System.out.println("Passed with B");
				
			case 'C': 
				System.out.println("Passed with A");
			
			default: 
				System.out.println("Failed"); // if this was up top all of it will run all answers since there is no break but since none of this are equal it will only read this last line. 
			
			}
			
			
			}
			
					
			}

}

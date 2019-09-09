package Day_15Class_Practice;

public class Class_Practice {
	
	public static void main(String[] args) {
		
		
		//boolean, float, double, long not accepted on switch statement 
		
		String day = "Tuesday";
		switch (day) { 
		case "Monday": 
			System.out.println("Java class Day");
			break;
		case "Tuesday":
			System.out.println("Java class");
			break;
		case "Wednesday":
			System.out.println("SQL");
			break;
		case "Thursday": 
			System.out.println("Selenium");
			break;
		case "Friday": 
			System.out.println("Selenium");
			break;
		case "Saturday": 
			System.out.println("SQL");
		default: 
			System.out.println("Day off");
			
			// you can make this simpler but just pairing all the ones with the the same "syso" together, you just place them back to back and remove one break line. 
			// use the switch statement to solve the HTTPS status code assignment on canvas 
		
		}
	}

}

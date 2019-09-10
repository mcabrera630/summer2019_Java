package Welcome.java;

public class day17_StringClass {
	
	private static final String Sytstem = null;

	/*
	 String Methods:
	 1. String is an object 
	   				there are two ways we can create string class object
	   				1. String literals:
	   						string str = "Cybertek";
	   						
	   				2. by using "new" keyword:
	   					String str = new String("Cybertek");
	   			
	   			Java Heap: a memory location where all the objects will be saved at  
	   			
	   			String Pool: located in Java Heap Memory, it's a very special memory location for String
	   			             literals. One memory location 
	   			             
	   			Every time if the String object is created by String literals, the object will be saved
	   			at String pool
	   			
	   			Every time if the String object is created by using "new" keyword, the object will be 
	   			saved at the Heap Memory, outside String pool 
	2. String is immutable: cannot be motifyed 
	3. String is sequences of characters: 
				each character in the String, has index number. index number starts from 0 
				String str = "Cybertek";
				index num:    01234567
	// == 
	  */
	
	
	/* concat(str): it takes String, and combines the two Strings and return it as a new String Value
	   
	  
	 */
	public static void main(String[] args) {
		
	
	String str1 = "Hello Javengers";
	String str2 = "Hello Javengers";
	boolean R1 = str1 == str2 ; 

	
	String str3 = new String("Hello Javengers");
	String str4 = new String("Hello Javengers");
	boolean R2 = str3 == str4;
	
	System.out.println("==========");
	
	String a = "Cybertek";
	a.concat("School"); // Cybertek School 
	System.out.println(a);
	a = a.concat("School"); // a = "Cybertek School"
	System.out.println(a);
	
	String A = "hello", B = "hello ";
	System.out.println(A==B); // false, different values
	
	String C = "Hello", D = "hello";
	System.out.println(C == D); // false, case sensitivity
	System.out.println("===========");
	
	// Length(): it returns the total number of the character as an int value
	
	String LongName = "ABCDEFGHIJKLMN";
		int num =LongName.length();
		System.out.println(num);
	// charAt:(indexNumber) : it returns the character of the index number as a char value
	String name1 = "Muhtar";
	char ch = name1.charAt(5);
	System.out.println(ch);

	// toUpperCase(): converts String value to UpperCase, and returns it as a NEW String value
	
	//toLowerCase(): converts the String value to LowerCase and returns it as a NEW String value
	
	String name2 = "cybertek";
	        name2.toUpperCase();
	System.out.println(name2);
	
	String name3 ="CYBRETEK";
			name3.toLowerCase();
			//This is Mauricio and im testin git
	// trim(): its used for removing the unused spaces
	String s1 = "                  hello";
			s1.trim();
			s1 = s1.trim();
			System.out.println(s1);
			
			String s2 = "Cybertek				School";
			s2 = s2.trim();
			System.out.println(s2);
			
			String s3 = "   ";
			s3 = s3.trim();
			System.out.println(s3);
			
			String s4 = "     Cybertek     School";
			s4 = s4.trim();
			System.out.println(s4);
			
	/*
	 susbtring(beginning index): 
	 			it creates sub value of the String from the beginning index till the last 
	 			index and returns it as a NEW String value   
	   */
	String str = "Cybertek School";
	//	          0123456789
	String Str2 = str.substring(9);
	System.out.println(str);
	
	
	
	}
}

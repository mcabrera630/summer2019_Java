package day15_Scanner_StringClass;

public class String_Method {

	/*
	 String methods: charAt (indexnum) : it takes the index number and return's its character as char value
	 Ex: String ctr = "Cybertek";
	 //index num      "01234567"
	  
	  str. charAt(5) == returns 't'; 
	  =====================
	  length(): returns the total number of characters 
	  		String name = "Donald J Trump";
	  		Ex: String str = " Cybertek";
	  		str.length() ==> 8 
	  =====================
	  concat (str): it takes a String and concats it to the String variable, and then returns a New String value
	   ex: String str = "Cybertek";
	   	str.concat ("School"); ===> "Cybertek School"
	  
	  =====================
	  
	  toUppercase: converts to upper case, and returns it as a brand new 
	  
	  
	 */
	
	public static void main(String[] args) {
		
		String str = "Cyber roc";
		//index num: "01234567" 
		// charAt(index):
		
		System.out.println(str.charAt(7));
		
		char ch = str.charAt(7);
		System.out.println(ch);
		System.out.println("============");
		String str2 = "Mu htar";
		//index num  "0123456"
		System.out.println(str2. charAt(2));
		System.out.println("===========");
		
		// Length 
		String name = "Donald J Trump";
		System.out.println(name.length()  );
		int n = name.length();
		System.out.println("============");
		String name1 = "Mauricio O Cabrera";
		System.out.println(name1.length() );
		int e = name1.length();
		System.out.println("============");
		
		//concat
		String s1 = "Cybertek";
			s1.concat(" School" );
			System.out.println(s1); // string is immutable, it will give "Cybertek" as result instead of School
		s1 = s1.concat(" School" );
		System.out.println(s1);
		
		s1 = s1.concat(" ");
		System.out.println(s1);
		
		System.out.println("==============");
		
		//toUpperCase
		String N = "Cybertek" ;
				N.toUpperCase();
		System.out.println(N);
	N = N.toUpperCase();
	System.out.println(N);
System.out.println("============");	
	// toLowerCase(): 
	String M = "CYBERTEK";
			M.toLowerCase();
			System.out.println(M);
			M= M.toLowerCase();
			System.out.println(M);
System.out.println("===========");
	String a = "Batch 12 Javengers";
	char d = a.charAt(6);
		System.out.println(d);
		
		// charAt() methods extracts a specific character for the and return it as a char value 
	}
}

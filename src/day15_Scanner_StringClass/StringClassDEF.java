package day15_Scanner_StringClass;

public class StringClassDEF {
/*
 String class:
 1. String is an object, there are two ways to create object from string class:
 			1. String literals
 					String str = "Cybertek";
 			
 			2. by using "new" keyword
 					String str = new String ("Cybertek")
 					
 	when the object is created by String literals, that object will be saved at String pool ( String pool does not take 
 	duplicates
 	
 	when the String object is created by using "new" keyword. The object will be saved at java Heap memory (not within
 	the String
 	
 	 every time we use new keyboard, compiler will create a new object in java Heap memory;
 	 
 	 heap memory: the place where all the objects are store at 
 	 
 	 String pool : located in heap memory, stores all string literals' objects 
 	 
 	 every time when we use a new keyword, compiler will create a new object in java Heap memory 
 	 
 	 2. String object represents the sequences of characters: ==> "ABCDEFG" 
 	 
 	 		each character in String has its own index number. index numbers start from 0 
 	 		
 	 		String str = "Cybertek" 
 	 		// index number: 01234567
 	 
 	3. String is immutable: 
 			once you declare it you cannot modify it 
 	 
 	 
 	
 	string methods: 
 			charAt(indexnum): 
                                                                                        
 */

public static void main(String [] args) {

String str = "Cybertek";
String A = "Cybertek";
String B = "Cybertek";
System.out.println(( A == B)); // both String literals are stores at String pool 

String str2 = new String("Cybertek" );

System.out.println(str == str2 ); // different memory locations

String str3 = new String ("Cybertek");
System.out.println(str2 == str3);
                                        
String s1 = "cat";
String s2 = "Cats 2";
System.out.println(s1==s2);
String s3 = new String ("Cat)");
String s4 = new String ("Cat");
System.out.println(s3 == s4);
System.out.println((s1 == s4));

String a = "Batch12";
String b = "batch12";
System.out.println(a == b );

String c = new String( "Cybertek");
String d = new String( "Cybertek");

System.out.println("=====================");






}



}

package Day_5;

public class Concatenation {

	/*
	 * 
	 * String: represents the sequences of characters. used for storing text string
	 * values are surrendered by a double quote
	 * 
	 * Concatenation: combining, linking things together ==> creates a String value
	 * achieve by using + operator we can concat any value to String
	 * 
	 * String: char sequences, declared within "", used of storing texts
	 * 
	 * Concatenation: linking things together, combining...
	 * 
	 */

	public static void main(String[] args) {

		String str = "any text goes here";
		System.out.println(" str ");

		String str2 = "1";
		System.out.println(str2);

		System.out.println("Hello World");

		String Hello = ("Hello World");
		System.out.println(Hello);

		String myName = "Cybertek" + "School";
		System.out.println(myName);

		String Year = "This is" + 2019;

		// example:

		String name = "Mauricio";
		System.out.println("My Name is " + name);

		/*
		 * cucumber is variable $ Tomato is variablename $
		 */

		int cucumber = 3;
		int tomato = 5;

		System.out.println("cucumber is " + '$' + cucumber);
		System.out.println("Tomato is " + "$" + tomato);

		String newStr = "100" + 10;

		System.out.println(newStr);

		System.out.println(1 + 2 + 3); // 6
		System.out.println("1" + 2 + 3); // "12"+3 ==> 123

		// System.out.println("1"+1-3); // "11"-3 wrong because you cannot subtract
		// numbers to a text.

		System.out.println("Batch 12" + 1 + 2); // "Batch121"+2 => batch1212 this example here is concat because it
												// starts with a text it will concat and just place the numbers the way
												// its listed rather then add
		System.out.println(2 - 1 + 1 + "4");

		System.out.println("Batch 12" + (1 + 2));

		System.out.println(1 + "123" + 4 + 5);

		System.out.println("123" + (4 + 5));
		System.out.println(1 + ("1" + 2));
		// 1 + "12" => 112

		System.out.println(4 + 3 - (9 + 3));

		System.out.println((1 + 2) + 3);

		System.out.println((1 + 2) + "3"); // but if this was a negative then it will not compute.

		String BookName = " I like the book called \' Game of Throne \' ";
		System.out.println(BookName);

		String MyInfo = "My Name is: \n\tCybertek";
		System.out.println(MyInfo);

		System.out.println('3' + 3);
		// 51 + 3 ===> 54

		System.out.println('7' + "3"); //
		System.out.println("3" + '7');
		System.out.println(1 + '7' + "3" + 2);

	}
}
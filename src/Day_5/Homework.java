package Day_5;

public class Homework {

	public static void main(String[] args) {
		long d = 200000l;
		byte a = 1;
		double f = 23234347474774444.00;
		short b = 257;
		float e = 6000f;
		int c = 4000;
		// System.out.println(c = a );
		// System.out.println(c = a);
		// System.out.println(a = (byte)c); //explicit
		// System.out.println(f = b); //implicit
		// System.out.println(e = d);
		// System.out.println(f = e); //implicit

		// System.out.println(d = c );//implicit
		// System.out.println(f = a);
		System.out.println(e = (float) f);

		// Primitive data types
		//double salary;
		//int age;
		//boolean isPaid;
		//char gender = 'm'; // m = male, f = female

		// System.out.print(" " + salary + ",");
		// System.out.print(" " + age + ",");
		// System.out.print(" " + isPaid + ",");
		// System.out.print(" " + gender);

		int i = 100;

		if (i <= 30) {
			System.out.print("M");
		} else {
			System.out.print("O");
		}
	}
}

/*
 * a = (byte) b; b = a; System.out.println(a);
 * 
 * a = (byte) c; b = (short) c; System.out.println(b); System.out.println(f);
 */

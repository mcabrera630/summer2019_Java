package Welcome;

public class task01_greaterNumber {

	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 30;
		int max = 0;

		if (num1 > num2) {
			max = num1;
			System.out.println("maximum equals num1 " + max);
		} else if (num2 > num1) {
			max = num2;
			System.out.println("maximum equals num2 " + max);
		} else {
			System.out.println("numbers are equal");
		}

	}
}

package week1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int num = 9;

		if (num <= 0) {
			System.out.println("Please enter a number greater than 0");

		}

		else if (num == 1 || num == 2 || num == 3) {
			System.out.println(num + " is a prime number");
		}

		else {
			for (int i = 2; i <= num / 2;) {

				if (num % i == 0) {
					System.out.println(num + " is Not a prime Number");
					break;
				} else {
					System.out.println(num + " is a Prime number");
					break;
				}
			}
		}
	}
}

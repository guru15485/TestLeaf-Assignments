package week1;

public class FindOddNumbers {

	public static void main(String[] args) {
		int maxRange=10;
		for (int i = 1; i <= maxRange; i++) {
			if (i%2==1) {
				System.out.println(i+" is a Odd Number");
				}
			else {
				System.out.println(i+" is a Even Number");
			}
		}

	}

}

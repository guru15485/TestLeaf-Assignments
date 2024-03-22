package javaChallenges;

import java.util.Scanner;

public class IntNumSquareRoot {

	public static void main(String[] args) {

		System.out.println("Enter the Number - ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		double temp = 0;
		double sqRt = number / 2;

		do {
			temp = sqRt;
			sqRt = (temp + (number / temp)) / 2;
		} while ((temp - sqRt) != 0);		
 
		int finalNumber = (int) sqRt;

		System.out.println(sqRt);

		System.out.println(finalNumber);

	}
}

package javaChallenges;

import java.util.Scanner;

public class S2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		double midValue=number/2;
		
		for (int i = 0; i <= midValue; i++) {
			
			int j=i*i;
			
			if (j==number) {
				System.out.println("\"Give number -"+number+" is a perfect Square root number");
				System.out.println("Square root is - "+i);
				
			}
			else if (j>number) {
				
				double d=i-1;
				double g=d*d;
				double a=number-g;
				double e=a/(d*2);
//				System.out.println(d);
				System.out.println(e);
				double f=d+e;
				
				
				System.out.println("Give number -"+number+" is not a perfect Square root number");
				System.out.println("The Square root of the given number -"+number+" is "+f);
				break;
				
			}
			
		}
	}

}

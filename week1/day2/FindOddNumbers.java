package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		System.out.print("The Odd Numbers are below :");
		for (int i = 0; i <=number; ++i) {
			if (i%2==1) {
				
				System.out.println(i);
			}
			//			else
			//			{
			//				System.out.println("The Even Number is :"+i);
			//			}
		}
		for (int i = 0; i < number; i++) {
			if (i==4) {
				System.out.println("Four");
				//				break;
				continue;
			}
			System.out.println(i);
		}
	}

}

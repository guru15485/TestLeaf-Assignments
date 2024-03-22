package week3.day1.learnString;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		//declare String variable
		String test="changeme";
		
		//covert String value to character
		char[] ch=test.toCharArray();
		
		//iterate for loop
		for (int i = 0; i < ch.length; i++) {
			if (i%2>0) {
				char uCase=Character.toUpperCase(ch[i]);
			System.out.print(uCase);
			}
			else {
				System.out.print(ch[i]);
			}
		}
		

	}

}

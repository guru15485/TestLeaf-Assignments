package week3.day1.learnString;

import java.util.Iterator;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="I am a software tester";
		
		System.out.println("Before the Odd Index words are reversed : "+test);
		String[] str=test.split(" ");
		int len=str.length;
//		System.out.println(len);
		String str1 = null;
	
		System.out.print("After the Odd Index words are reversed : ");
		for (int i = 0; i < len; i++) {
			if (i%2==0) {
				
				System.out.print(str[i]+" ");
						
			}
			else {
			
			char[] ch=str[i].toCharArray();
			for (int j = ch.length-1; j >= 0; j--) 
			{				
				System.out.print(ch[j]);					
			}
			System.out.print(" ");
			}
			
		}
	}

}

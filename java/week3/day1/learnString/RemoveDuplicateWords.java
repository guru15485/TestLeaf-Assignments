package week3.day1.learnString;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		//declare String
		String text = "We learn Java basics as part of java sessions in java week1";
		
		//split the words
		String[] str=text.split(" ");
		 
		System.out.println("Length of the given String is -"+str.length);
		
		int i;
		int j;
		String str1[] = text.split(" ");
		String str2[] = text.split(" ");
		
		System.out.println("Before remove the duplicate words");
		for (int x = 0; x < str.length; x++) {
		System.out.print(str1[x]+" ");		
		}
		System.out.println();
		System.out.println("_________________________________________________________________");
		System.out.println("after remove the duplicate words");
		//Initialize the nested loop
		for ( i = 0; i < str.length; i++) {
			for ( j = 0; j < str.length;j++) {
				
				if(j!=i && str[i].contentEquals(str1[j]))
						{
					str2[i]= " ";
					
					continue;
				}
				
			}
			System.out.print(str2[i]+" ");
		}
		

	}

}


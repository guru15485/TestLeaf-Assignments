package week3.day1.learnArray;

import java.util.Arrays;

public class FindArraysMatchElements {

	public static void main(String[] args) {
		int a[]={3,2,11,4,6,7};
		 int b[]={3,2,8,4,9,7}; 
		 
		 int aLen=a.length;
		 int bLen=b.length;
		 int i;
		 int j;
		 
		 		 
		 for (i = 0; i < aLen; i++) {
			 for (j = 0; j < bLen; j++) {
				 if (a[i]==b[j]) {
//					 System.out.println("Value -"+a[i]+" of Array 1 is matches with the Array 2's value -"+b[j]);
					 System.out.println("The matching values from both the arrays are -"+a[i]);
					 }
				 
			}
			 
			 	
		}
		 

	}

}

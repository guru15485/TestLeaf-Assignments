package week3.day2.learnList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		Collections.addAll(list, 1, 2, 3, 4, 11, 7, 8);

		System.out.println("The list elements before sorting : " + list);

		// sort the list
		Collections.sort(list);

		// find the size of list
		int size = list.size();
		System.out.println("The size of the List is - "+size);

		System.out.println("The list elements after sorting : " + list);

		// initialize the loop
		System.out.print("The missing number in the sequence is/are- ");
		for (int i = 0; i < size; i++) {
			// condition to not exceed the list boundary
			if (i + 1 != size) {
				int x = list.get(i);
				int y = list.get(i + 1);
				int z = y - x;
				/*
				 * - find the difference(subtract the first element value from next element
				 * value) between the sequence elements of the array if the difference value is
				 * more than 1 means there is a gap in the sequence
				 */
				
				
				
				 
				
				if (z > 1) {
					/*
					 *  find the missing number by iterating the loop till the difference value from the current element
					 */

					for (int j = 1; j < z; j++) {
						int a = x + j;
						System.out.print(a + ",");
					}
				}

			}

		}

	}
}

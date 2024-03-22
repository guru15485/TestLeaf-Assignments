package javaChallenges;

public class Challenge4_FindUniqueNumber {

	public static void main(String[] args) {
		int[] num = { 2, 2, 5, 1, 1, 5, 7, 1, 3, 7, 9 };
		int i;
		int j;
		int k;

		for (i = 0; i < num.length; i++) {
			k = 0;
			for (j = 0; j < num.length; j++) {
				if (num[j] == num[i]) {
					k = k + 1;
					continue;
				}

			}
			if (k > 1) {

			} else {
				System.out.println(num[i]);
			}
		}

	}
}

package javaChallenges;

public class Challenge2_FindSquareRoot {

	public static void main(String[] args) {
		
		/* declare a given number(num=36;)
		 * declare a variable to half of the given number(int n=num/2;)
		 * initiate a while loop to iterate to find the match of the i and it's remainder(store remainder in variable int j;)
		 * 
		 */
		
		int num=8;
		int n=num/2;
		int i=2;
		
		
		while(i<=n)
		{
			
			int j=num/i;
			if(j==i)
			{
				System.out.println("The square root of the given number -"+num+" is -"+j);
				break;
			}
			i++;
		}
		
	}

}

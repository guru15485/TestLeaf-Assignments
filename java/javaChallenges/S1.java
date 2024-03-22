package javaChallenges;

public class S1 {

	public static void main(String[] args) {
		int number=35;
		double temp;  
		double sqRt=number/2;  
		
		do   
		{  
		temp=sqRt;  
		sqRt=(temp+(number/temp))/2;  
		}   
		while((temp-sqRt)!= 0); 
		
		int finalNumber=(int) sqRt;
		
		System.out.println(finalNumber);

	}

}

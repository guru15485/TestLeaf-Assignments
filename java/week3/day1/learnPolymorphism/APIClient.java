package week3.day1.learnPolymorphism;
//Polymorphism-Home Assignment-Overloading
public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println("The request for -"+endpoint);

	}
	
public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("The request for -"+endpoint+" is "+requestBody+" and the success status is "+requestStatus);
		
	}
		public static void main(String[] args) {
			APIClient req=new APIClient();
			req.sendRequest("Inquiry");
			req.sendRequest("Inquiry", "Scheduled", true);
		}
}

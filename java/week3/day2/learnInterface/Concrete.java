package week3.day2.learnInterface;

public abstract class Concrete implements DatabseConnection{

	public void connect() {
		System.out.println("This method - connect is impletemented from DatabseConnection Interface");
		
	}
	
	public void disconnect() {
		System.out.println("This method - disconnect is impletemented from DatabseConnection Interface");
		
	}
	
	public void executeUpdate() {
		System.out.println("This method - executeUpdate is impletemented from DatabseConnection Interface");
		
	}
}

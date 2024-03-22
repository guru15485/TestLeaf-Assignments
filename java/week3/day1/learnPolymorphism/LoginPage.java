package week3.day1.learnPolymorphism;
//Polymorphism-Home Assignment-Sub class
public class LoginPage extends BasePage {
	
	@Override
	public void performCommonTasks() {
		System.out.println("This method 'performCommonTasks' from LoginPage class");
		
	}

	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.performCommonTasks();
		

	}

}

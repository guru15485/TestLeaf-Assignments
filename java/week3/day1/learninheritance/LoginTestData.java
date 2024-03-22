package week3.day1.learninheritance;
//SingleLevel_Inheritance_Home_Assignment_Hints
public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Please enter username from LoginTestData class");

	}
	
	public void enterPassword() {
		System.out.println("Please enter password from LoginTestData class");

	} 
	
	public static void main(String[] args) {
	LoginTestData obj=new LoginTestData();
	
	obj.enterCredentials();
	obj.navigateToHomePage();
	obj.enterUsername();
	obj.enterPassword();
		

	}

}

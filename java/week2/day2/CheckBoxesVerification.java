package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxesVerification {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");

		// maximize the browser
		driver.manage().window().maximize();

		// declare wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		// Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]"))
				.click();

		// Click on the "Notification Checkbox."
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();

		// Verify that the expected message is displayed.
		String s = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println(s);
		if (s.equals("Checked")) {
			System.out.println("Message verified");
		} else {
			System.out.println("No Message");
		}

		// Click on your favorite language (assuming it's related to checkboxes).
		driver.findElement(By.xpath("//label[text()='Java']/preceding::div[1]")).click();
		
		// Click on the "Tri-State Checkbox."
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[3]")).click();
		
		// Verify which tri-state option has been chosen.
		String s1 = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
		System.out.println(s1);
		if (s1.equals("State = 1")) {
			System.out.println("Message verified - State = 1 selected");
		} else {
			System.out.println("No Message");
		}
		
		// Click on the "Toggle Switch."
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		// Verify that the expected message is displayed.
		String s2 = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println(s);
		if (s2.equals("Checked")) {
			System.out.println("Message verified");
		} else {
			System.out.println("No Message");
		}
		
		// Verify if the Checkbox is disabled.
		boolean b=driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/following::span[1]")).isDisplayed();
		if (b==true) {
			System.out.println("Verify if check box is disabled");
			
		}
		// Select multiple options on the page (details may be needed).
		Thread.sleep(30);
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		Thread.sleep(120);
		
		driver.findElement(By.xpath("(//label[text()='Paris']/preceding::div[1])[2]")).click();
		Thread.sleep(120);
		driver.findElement(By.xpath("(//label[text()='Rome']/preceding::div[1])[2]")).click();
		
		// Perform any additional actions or verifications required.
		
		// Close the web browser when done.
		Thread.sleep(120);
		driver.close();

	}

}

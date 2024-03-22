package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Registration {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Guruthilak");
		driver.findElement(By.name("lastname")).sendKeys("Ganesan");
		driver.findElement(By.name("reg_email__")).sendKeys("ganesna.guruthilak@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Mar#032024");
		
		WebElement dob_Day = driver.findElement(By.name("birthday_day"));
		Select dayDD=new Select(dob_Day);
		dayDD.selectByVisibleText("15");
		
		WebElement dob_Month = driver.findElement(By.name("birthday_month"));
		Select monthDD=new Select(dob_Month);
		monthDD.selectByVisibleText("Apr");
		
		WebElement dob_Year = driver.findElement(By.name("birthday_year"));
		Select yearDD=new Select(dob_Year);
		yearDD.selectByVisibleText("1985");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		
		
		
		
		
		

	}

}

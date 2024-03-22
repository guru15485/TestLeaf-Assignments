package week2.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookBusTicket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(20);
		
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("(//button[@class='btn active text tertiary md active button'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-search filled primary lg inactive button']")).click();
		
		
		
		
		
		
	}

}

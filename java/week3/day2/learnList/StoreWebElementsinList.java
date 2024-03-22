package week3.day2.learnList;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreWebElementsinList {

	public static void main(String[] args) throws InterruptedException {
		// log in to the ajio Website
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		//In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);
		
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();

		Thread.sleep(240);
		
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(text(),'Fashion')]")).click();

		Thread.sleep(360);

		
		
		//Print the count of the items found.
		WebElement itemsFound = driver.findElement(By.xpath("//div[@class='length']"));

		System.out.println(itemsFound.getText());
		
		// find the brand name
		List<WebElement> brandName = driver.findElements(By.className("brand"));

		int len = brandName.size();

		System.out.println("Number of items found - "+len);
		
		List<String> bName = new ArrayList<>();

		for (int i = 0; i < brandName.size(); i++) {
			String text = brandName.get(i).getText();
			System.out.println(text);

			bName.add(text);
		}

		System.out.println(bName);

		// find the product name
		List<WebElement> productName = driver.findElements(By.className("nameCls"));

		int len1 = productName.size();

		System.out.println(len1);

		List<String> pName = new ArrayList<>();

		for (int i = 0; i < brandName.size(); i++) {
			String text = productName.get(i).getText();
			System.out.println(text);

			pName.add(text);
		}

		System.out.println(pName);

	}

}

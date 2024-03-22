package week1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.core.backend.Options;

public class LearnNonSelectTagDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0f9wl6ot9ax56159avd4q8dha0425835.node0");
		
		 driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[1]")).click();
	
		driver.findElement(By.xpath("//li[text()='India']")).click();
	}

}

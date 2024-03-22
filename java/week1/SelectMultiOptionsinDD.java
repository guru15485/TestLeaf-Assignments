package week1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultiOptionsinDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0f9wl6ot9ax56159avd4q8dha0425835.node0");
		
		WebElement toolDD = driver.findElement(By.className("ui-selectonemenu"));
		
		
		Select dd=new Select(toolDD);
		
		List<WebElement> options = dd.getOptions();
		
		int size=options.size();
		
		System.out.println("The size of the Tools filter drop down values are - "+size);
		
		
		for (int i = 1; i < size; i++) {
			String str = options.get(i).getText();
			options.get(i).click();
			System.out.println("The dropdown value of the '"+i+"' is - "+str);	
						
		}
	}

}

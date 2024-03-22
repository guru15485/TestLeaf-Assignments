package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountTL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		System.out.println("TestLeaf URL launched in Chrome browser successfully");
		System.out.println(driver.getTitle());

		driver.findElement(By.partialLinkText("SFA")).click();
		System.out.println(driver.getTitle());

		driver.findElement(By.linkText("Accounts")).click();
		System.out.println(driver.getTitle());

		driver.findElement(By.linkText("Create Account")).click();
		System.out.println(driver.getTitle());

		driver.findElement(By.id("accountName")).sendKeys("Guruthilak G");

		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		WebElement indusFilter = driver.findElement(By.name("industryEnumId"));
		Select indusDDV = new Select(indusFilter);
		indusDDV.selectByVisibleText("Computer Software");

		WebElement ownFilter = driver.findElement(By.name("ownershipEnumId"));
		Select ownDDV = new Select(ownFilter);
		ownDDV.selectByVisibleText("S-Corporation");

		WebElement srcFilter = driver.findElement(By.id("dataSourceId"));
		Select srcDDV = new Select(srcFilter);
		srcDDV.selectByValue("LEAD_EMPLOYEE");

		WebElement marFilter = driver.findElement(By.id("marketingCampaignId"));
		Select marDDV = new Select(marFilter);
		marDDV.selectByIndex(6);

		WebElement stateFilter = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateDDV = new Select(stateFilter);
		stateDDV.selectByValue("TX");

		driver.findElement(By.className("smallSubmit")).click();

		// allow duplicate records by click the ignore button when it is avaialble

		if (driver.findElement(By.linkText("Create Account Ignoring Duplicates")).isEnabled()) {

			driver.findElement(By.linkText("Create Account Ignoring Duplicates")).click();
			driver.switchTo().alert().accept();

			String accName = driver.findElement(By.xpath("//span[text()='Account Name']/following::span[1]")).getText();

			System.out.println(accName);

			if (accName.contains("Guruthilak")) {
				System.out.println("The entered account name is -" + accName + " is verified");
			} else {
				System.out.println("The enter account name is incorrect");
			}

			System.out.println(driver.getTitle());

			driver.close();

		} else {

//		driver.findElement(By.className("smallSubmit")).click();

			String accName = driver.findElement(By.xpath("//span[text()='Account Name']/following::span[1]")).getText();

			System.out.println(accName);

			if (accName.contains("Guruthilak")) {
				System.out.println("The entered account name is -" + accName + " is verified");
			} else {
				System.out.println("The enter account name is incorrect");
			}

			System.out.println(driver.getTitle());

		driver.close();
		}
	}

}

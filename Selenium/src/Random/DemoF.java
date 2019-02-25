package Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoF 
{
	static
	  {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  }
	  
	  public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.religarehealthinsurance.com/rhicl/proposalcp/renew/index-care");
			driver.findElement(By.id("policynumber")).sendKeys("1000");
			driver.findElement(By.id("dob")).click();
			driver.findElement(By.linkText("26")).click();
			driver.findElement(By.id("alternative_number")).sendKeys("1234567890");
			driver.findElement(By.id("renew_policy_submit")).click();
		}

}

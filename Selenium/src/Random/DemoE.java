package Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoE 
{
	static
	  {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  }
	  
	  public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver= new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://www.flipkart.com");
			
			String xp="(//input[@type='text'])[2]";
			driver.findElement(By.xpath(xp)).sendKeys("Bhanu");
			
			Thread.sleep(15000);
			String xp2="(//button[not(@type)]";
			driver.findElement(By.xpath(xp2)).click();
			
		}

}

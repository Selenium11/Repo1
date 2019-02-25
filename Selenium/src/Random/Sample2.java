package Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
{
	static
	  {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  }
	  
	  public static void main(String[] args) throws Exception
		{
			WebDriver driver= new ChromeDriver();
			System.out.println(driver);
			driver.get("file:///C:/Users/COMPAQ/Desktop/B2.html");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector(("input[type='text1']")));
		}

}

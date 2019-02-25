package Random;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 
{
	static
	  {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  }
	  
	  public static void main(String[] args) throws Exception
		{
			WebDriver driver= new ChromeDriver();
			driver.get("file:///C:/Users/COMPAQ/Desktop/Sample2.html");
			WebElement v1=driver.findElement(By.tagName("a"));
			List<WebElement>allLinks=driver.findElements(By.tagName("a"));
			int count=allLinks.size();
			System.out.println(count);
			driver.close();
		}

}

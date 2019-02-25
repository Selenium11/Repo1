package Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo 
{
	static
	  {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  }
	  
	  public static void main(String[] args) throws Exception
		{
			WebDriver driver= new ChromeDriver();
			driver.get("file:///C:/Users/COMPAQ/Desktop/Sample1.html");
			driver.findElement(By.xpath("./html/body/a"));
		}


}

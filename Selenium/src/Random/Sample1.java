package Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
  static
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
  }
  
  public static void main(String[] args) throws Exception
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/COMPAQ/Desktop/Sample1.html");
	}

}
                     
package Random;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoG 
{
	static
	  {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  }
	  
	  public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.naukri.com");
			
			Set<String> allWHS=driver.getWindowHandles();
			int count=allWHS.size();
			System.out.println(count);
			
			for(String wh:allWHS)
			{
				driver.switchTo().window(wh);
				System.out.println(driver.getTitle());
				Thread.sleep(1000);
				driver.close();
			}
		}

}

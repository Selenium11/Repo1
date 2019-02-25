package Random;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoH 
{
	static
	  {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  }
	  
	  public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver= new ChromeDriver();
			String parent=driver.getWindowHandle();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("http://localhost/login.do");
			driver.findElement(By.id("licenseLink")).click();
			Set<String>allWHS=driver.getWindowHandles();
			
			for(String wh:allWHS)
			{
				driver.switchTo().window(wh);
			}
			
			List<WebElement>allH=driver.findElements(By.xpath("//h2"));
			int count=allH.size();
			System.out.println(count);
			
			for(WebElement h:allH)
			{
				System.out.println(h.getText());
			}
			driver.close();
			Thread.sleep(1000);
			driver.switchTo().window(parent);
			driver.close();
		}

}

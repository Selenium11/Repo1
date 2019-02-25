package Random;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoI 
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
			driver.findElement(By.linkText("actiTime Inc.")).click();
			Thread.sleep(2000);
			Set<String>allWHS=driver.getWindowHandles();
			int count=allWHS.size();
			System.out.println(count);
			
			for(String wh:allWHS)
			{
				driver.switchTo().window(wh);
				System.out.println(driver.getTitle());
			}
			
			WebDriverWait wait=new WebDriverWait(driver,10); 
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cookie-button-got-it")));
			driver.findElement(By.id("cookie-button-got-it")).click();
			driver.close();
			driver.switchTo().window(parent);
			driver.close();
			
		}

}

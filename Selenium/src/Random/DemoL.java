package Random;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoL 
{
	static
	  {
		  System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	  }
	  
	  public static void main(String[] args) throws InterruptedException, AWTException 
		{
			WebDriver driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.seleniumhq.org/dowmload/");
			String xp="//td[text()='Java']/../td[4]/a";
			driver.findElement(By.xpath(xp)).click();
			Thread.sleep(2000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_ALT);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
		}

}

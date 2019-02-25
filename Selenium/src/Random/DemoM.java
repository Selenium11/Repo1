package Random;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoM 
{
	static
	  {
		  System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	  }
	public static void main(String[] args) throws Exception 
	  {
		 WebDriver driver=new FirefoxDriver();
		 driver.get("http://www.google.com");
		 Thread.sleep(5000);
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_P);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 
		 Thread.sleep(5000);
		 r.keyPress(KeyEvent.VK_ALT);
		 r.keyPress(KeyEvent.VK_G);
		 r.keyRelease(KeyEvent.VK_ALT);
		 
		 Thread.sleep(5000);
		 r.keyPress(KeyEvent.VK_ESCAPE);
		 r.keyRelease(KeyEvent.VK_ESCAPE);
		 
		 
		 
		  
	  }

}

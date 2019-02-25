package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginPage1
{
	static
	  {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  }
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com");
		Thread.sleep(2000);
		LoginPage1 l1=new LoginPage1(driver);
		l1.setLinkCount();
	}

}

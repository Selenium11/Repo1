package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin
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
		LoginPage c1=new LoginPage(driver);
		
		c1.setUserName("admin1");
		c1.setPassword("manager1");
		c1.clickLogin();
		
		Thread.sleep(2000);
		c1.setUserName("admin");
		c1.setPassword("manager");
		c1.clickLogin();
	}
}
package Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoC 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
	}
	public static void main(String[] args) throws Exception
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com");
		WebElement unTB=driver.switchTo().activeElement();
		unTB.sendKeys("Bhanu");
		unTB.sendKeys(Keys.CONTROL+"a");
		unTB.sendKeys(Keys.DELETE+"a");
		Thread.sleep(1000);
		
	}

}

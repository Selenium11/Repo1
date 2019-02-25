package Random;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoA 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
	}
	public static void main(String[] args)
	{
		ChromeDriver driver= new ChromeDriver();
		driver.close();
		//FirefoxDriver driver= new FirefoxDriver();
		//driver.close();
	}

}

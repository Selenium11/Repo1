package Random;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoB 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
	}
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.naukri.com");
		Set<String> whs= driver.getWindowHandles();
		System.out.println(whs.size());
		//print all the window handles
		for(String wh:whs)
		{
			System.out.println(wh);
		}
		driver.quit();
	}

}

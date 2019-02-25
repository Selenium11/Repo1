package tuesday;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class DemoI 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		String actual=driver.getTitle();
		String expected="boogle";
		Assert.assertEquals(actual, expected);
		//if(actual.equals(expected))
		//{
			//Reporter.log("pass..",true);
		//}
		//else
		//{
			//Reporter.log("Fail..".true);
		//}
	}

}

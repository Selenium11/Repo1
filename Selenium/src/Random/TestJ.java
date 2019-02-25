package Random;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJ 
{
	static
	  {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  }
	  
		  public static void main(String[] args) throws Exception 
			{
				WebDriver driver= new ChromeDriver();
				File f= new File("./cv/M.docx");
				String absolutePath=f.getAbsolutePath();
				driver.get("file:///C:/Users/COMPAQ/Desktop/naukri.html");
				WebElement browseButton=driver.findElement(By.id("cv"));
				browseButton.sendKeys(absolutePath);
			}
}



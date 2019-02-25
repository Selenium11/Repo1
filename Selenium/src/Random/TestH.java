package Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestH 
{
	static
	  {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  }
	  
	  public static void main(String[] args) 
		{
			WebDriver driver= new ChromeDriver();
			driver.get("http://demo.actitime.com");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text]='Login']")).click();
			
			//WebDriverWait wait=new WebDriverWait(driver,10);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(logoutLink))click();
			
			try{
				Thread.sleep(10000);
			}catch(InterruptedException e){
			}
			driver.findElement(By.id("logoutLink")).click();
		}
}


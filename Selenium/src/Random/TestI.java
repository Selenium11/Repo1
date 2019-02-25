package Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestI 
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
			while(true){
				try{
					driver.findElement(By.id("logoutLink")).click();
					System.out.println("Logout link is found and clicked");
					break;
				}
				catch(Exception e){
					System.out.println("Logout link is not found will try again" );
				}
			}
			System.out.println("End");
		}
			
}

package Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestC 
{
	static
	  {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  }
	  
	  public static void main(String[] args) throws Exception
		{
			WebDriver driver= new ChromeDriver();
			driver.get("file:///C:/Users/COMPAQ/Desktop/hotel.html");
			WebElement mtrLB=driver.findElement(By.id("mtr"));
			Select select=new Select(mtrLB);
			select.selectByIndex(0);
			select.selectByValue("v");
			select.selectByVisibleText("Dosa");
			select.deselectByIndex(0);
			select.deselectByValue("v");
			select.deselectByVisibleText("Dosa");
		}
			
			

}

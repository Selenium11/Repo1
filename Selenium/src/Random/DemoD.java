package Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoD 
{
	static
	  {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  }
	  
	  public static void main(String[] args) 
		{
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
			driver.findElement(By.id("loginbutton")).click();
			//wait till JS popup is displayed
			WebDriverWait wait=new WebDriverWait(driver,5);
			wait.until(ExpectedConditions.alertIsPresent());
			//Click Ok button present on the popup
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();//click ok
			//alert.dismiss();//click cancel
		}

}

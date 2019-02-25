package Random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestF 
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
			List<WebElement>allOptions=select.getOptions();
			List<String>allText=new ArrayList<String>();
			
			for(WebElement option:allOptions)
			{
				String text=option.getText();
				allText.add(text);
			}
			Collections.sort(allText);
			for(String text:allText)
			{
				System.out.println(text);
			}
			driver.close();
		}

}

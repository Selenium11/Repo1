package Random;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestD 
{
	static
	  {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  }
	  
	  public static void main(String[] args) throws Exception
		{
			WebDriver driver= new ChromeDriver();
			driver.get("file:///C:/Users/COMPAQ/Desktop/hotel.html");
			WebElement slvLB=driver.findElement(By.id("slv"));
			Select slv=new Select(slvLB);
			List<WebElement>allSOs=slv.getAllSelectedOptions();
			int count=allSOs.size();
			System.out.println(count);
			for(int i=0;i<count;i++)
			{
				WebElement option=allSOs.get(i);
				String text=option.getText();
				System.out.println(text);
			}
			driver.close();
		}

}

package Random;

import java.awt.AWTException;
import java.awt.Robot;

public class DemoJ 
{
	static
	  {
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  }
	  
	  public static void main(String[] args) throws AWTException, InterruptedException 
	  {
		  Robot r=new Robot();
		  
		  for(int i=1;i<=200;i++)
		  {
			  r.mouseMove(i, 200);
			  Thread.sleep(2000);
		  }
				  
	  }

}

package Random;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class DemoK 
{
	 public static void main(String[] args) throws Exception 
	  {
		 Runtime.getRuntime().exec("notepad");
		 Thread.sleep(1000);
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_SHIFT);
		  
	  }

}

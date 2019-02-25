package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void test1()
	{
		Reporter.log("Qspiders");
		Reporter.log("Jspiders",true);
		Reporter.log("Tspiders",false);
		
	}
	

}

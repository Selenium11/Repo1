package tuesday;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB extends BaseTest
{
	@Test
	public void testB1()
	{
		Reporter.log("@T1",true);
	}
	
	@Test
	public void testB2()
	{
		Reporter.log("@T2",true);
	}

}

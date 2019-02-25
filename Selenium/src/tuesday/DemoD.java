package tuesday;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoD 
{
	@Test(priority=1)
	public void C()
	{
		Reporter.log("breakfast",true);
	}
	
	@Test(priority=0)
	public void B()
	{
		Reporter.log("lunch",true);
	}
	
	@Test(priority=2)
	public void A()
	{
		Reporter.log("Dinner",true);
	}

}

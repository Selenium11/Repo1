package tuesday;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA extends BaseTest
{
	@Test
	public void TestA()
	{
		Reporter.log("@1",true);
	}

}

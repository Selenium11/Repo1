package tuesday;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	@BeforeSuite
	public void m1()
	{
		Reporter.log("@BS",true);
	}
	
	@BeforeTest
	public void m2()
	{
		Reporter.log("@BT",true);
	}

	@BeforeClass
	public void m3()
	{
		Reporter.log("@BC",true);
	}

	@BeforeMethod
	public void m4()
	{
		Reporter.log("@BM",true);
	}
	
	@AfterSuite
	public void m5()
	{
		Reporter.log("@AS",true);
	}
	
	@AfterTest
	public void m6()
	{
		Reporter.log("@AT",true);
	}

	@AfterClass
	public void m7()
	{
		Reporter.log("@AC",true);
	}

	@AfterMethod
	public void m8()
	{
		Reporter.log("@AM",true);
	}
	
	


}

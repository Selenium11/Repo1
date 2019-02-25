package tuesday;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoF 
{
	@Test()
	public void createUser()
	{
		Reporter.log("user created successfully",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods="createUser")
	
	public void deleteUser()
	{
		Reporter.log("user deleted successfully",true);
	}
	
	@Test(dependsOnMethods="createUser")
	public void editUser()
	{
		Reporter.log("user edited successfully",true);
	}

}

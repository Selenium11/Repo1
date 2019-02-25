package tuesday;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoE
{
	@Test(groups="s")
	public void createUser()
	{
		Reporter.log("user created successfully",true);
	}
	
	@Test(groups="m")
	public void deleteUser()
	{
		Reporter.log("user deleted successfully",true);
	}
	
	@Test(groups="s")
	public void editUser()
	{
		Reporter.log("user edited successfully",true);
	}

}

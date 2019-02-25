package tuesday;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoC 
{
	@Test(invocationCount=2)
	public void createUser()
	{
		Reporter.log("user created successfully",true);
	}
	
	@Test(priority=0)
	public void deleteUser()
	{
		Reporter.log("user deleted successfully",true);
	}
	
	@Test(priority=0)
	public void editUser()
	{
		Reporter.log("user edited successfully",true);
	}

}

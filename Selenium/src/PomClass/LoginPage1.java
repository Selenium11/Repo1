package PomClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1
{
	@FindBy(xpath="//div[text()='Login ']")
	private List<WebElement> allLinks;
	
	
	public LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setLinkCount()
	{
		int count=allLinks.size();
		System.out.println(count);
	}

}

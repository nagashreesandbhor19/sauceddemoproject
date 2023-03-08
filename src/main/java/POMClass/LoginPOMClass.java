package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass
{
	WebDriver driver;
	private Actions act;
	
	@FindBy(xpath=" //input[@id=\"user-name\"]")
	WebElement username;
	
	@FindBy(xpath=" //input[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@id=\"login-button\"]")
	WebElement loginbutn;

	public LoginPOMClass(WebDriver driver) 
	{ 
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		act=new Actions(driver);
	}
	
	
public void sendusername()
{
	username.sendKeys("standard_user");
}

	
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}

	

	
//	public void loginbutn()
//	{
//		loginbutn.click();
//	}
	
	//mouse action act
	public void clickloginbutn()
	{
		act.click(loginbutn).perform();
	}


	
 
}

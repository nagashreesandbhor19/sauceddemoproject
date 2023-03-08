package Testclass;

import org.testng.annotations.Test;

import POMClass.HomePOMClass;

public class TC02_VerifyLogoutFunctionality extends TestBaseClass
{
	@Test
	public void verifyLogOut()
	{
		HomePOMClass hp=new HomePOMClass(driver);
		hp.ClickSettingBtn();
		hp.clicklogoutbtn();
	System.out.println("Apply verfication");

String expectedTitle="Swag Labs";
String actualTitle=driver.getTitle();
if(expectedTitle. equals(actualTitle))
{
	System.out.println("logout test case is pass");
}
else
{
	System.out.println("logout test case is fail");
	
}
}}

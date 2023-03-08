package Testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_VerifyLoginFunctionally extends TestBaseClass
{
	@Test
	public void verifyLoginFunctionality()
	{
	System.out.println("Apply verification");
    String expectedTitle ="Swag Labs";
	  System.out.println("expectedTitle-->"+expectedTitle);
	 
	String acutalTitle= driver.getTitle();
	  System.out.println(acutalTitle);
	  
	  Assert.assertEquals(acutalTitle,expectedTitle);
}
}
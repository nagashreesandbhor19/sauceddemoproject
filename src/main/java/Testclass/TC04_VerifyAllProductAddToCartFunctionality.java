package Testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import POMClass.HomePOMClass;

public class TC04_VerifyAllProductAddToCartFunctionality extends TestBaseClass
{
@Test
public void verifyallproductaddtocart()
{
      HomePOMClass hp=new HomePOMClass(driver);
      hp.clickMulitProduct();
      System.out.println("clicked on mulit products");
      
	System.out.println("Apply verfication");
	
	String expectedproductselected="6";
	System.out.println("expectedproductselected "+expectedproductselected);
	
	String actualproductselected=hp.getTextFromAddTOCart();
	System.out.println("actualproductselected"+actualproductselected);
	
	Assert.assertEquals(actualproductselected,expectedproductselected );
	
}	
	
}

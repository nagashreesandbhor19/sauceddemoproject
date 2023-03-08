package Testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import POMClass.HomePOMClass;

public class TC03VerifyAddToCartproduct extends TestBaseClass
{
	@Test
	public void AddToCart()
	{
	HomePOMClass hp=new HomePOMClass(driver);
	hp.clickbagproduct();
	System.out.println("click on product");
	hp.clickaddtocart();
	System.out.println("click on add to cart");
	
	System.out.println("Apply verfication");
	
	String expectedproductselected="1";
	String actualproductselected=hp.getTextFromAddTOCart();
	
	
	Assert.assertEquals(expectedproductselected,actualproductselected );
	
	}

}



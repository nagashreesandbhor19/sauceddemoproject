package POMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass
{ 
	private WebDriver driver;
	private Select s;
	@FindBy(xpath="//button[@id=\"react-burger-menu-btn\"]")
	WebElement settingbtn;
	
	public void ClickSettingBtn()
	{
		settingbtn.click();
	}
	
	
	@FindBy(xpath="//a[@id=\"logout_sidebar_link\"] ")
	WebElement logoutbtn;
	public void clicklogoutbtn()
	{
		logoutbtn.click();
	}
	@FindBy(xpath="//select[@class=\"product_sort_container\"] ")
	WebElement dropdown ;
	public void clickdropdown()
	{
	     dropdown.click();
	     s.selectByValue("lohi");
		
	}

	
	
	@FindBy(xpath="//img[@alt=\"Sauce Labs Backpack\"]")
	WebElement bagproduct;
	public void clickbagproduct()
	{
		bagproduct.click();
		
	}
	
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement addtocart;
	public void clickaddtocart()
	{
		addtocart.click();
		
	}
	
	@FindBy(xpath="//span[@class=\"shopping_cart_badge\"] ")
	WebElement addtocartproduct;
	public String getTextFromAddTOCart()
	{
		String actualproductselected=addtocartproduct.getText();
		return actualproductselected;
	}
	
	     @FindBy(xpath="//button[text()='Add to cart']")
	     List<WebElement>mulitproducts; 
			
		
	     
	     public void clickMulitProduct()
	     {
	    	for(int i=0;i<mulitproducts.size();i++) 
	    	{
	    		mulitproducts.get(i).click();
	    	}
	    	 for(WebElement z:mulitproducts)
	    		 
	    		 z.click();
	    	 
	     }
		
	     
	     public HomePOMClass (WebDriver driver) 
	 	{ 
	 		this.driver=driver;
	 		
	 		PageFactory.initElements(driver,this);
	 		
	 		s=new Select(dropdown);
	 		
	 	}


					
		}



	
	
	

	
	
	

	

		

	



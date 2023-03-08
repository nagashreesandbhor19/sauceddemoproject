package Testclass;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import POMClass.LoginPOMClass;
import UtilityPack.UtilityClass;

public class TestBaseClass 
{   
WebDriver driver;

Logger log=Logger.getLogger("SauceDemo");

@Parameters("browserName")
	
	@BeforeMethod
	public void  setup(String browserName)throws IOException
	{
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","D:\\E BKP\\chromedriver.exe");	
		 driver = new ChromeDriver();
	}
		 else
		 {
			 System.setProperty("webdriver.gecko.driver","D:\\E BKP\\geckodriver-v0.32.2-win32\\geckodriver.exe");	
			 driver = new FirefoxDriver();
 }
	
	PropertyConfigurator.configure("log4j.properties");
			 log.info("open browser");
			 
		driver.manage().window().maximize();
		log.info("browser is maximized");
		
		  driver.get("https://www.saucedemo.com/ ");
		  log.info("url opened");
	UtilityClass.screenshotMethod(driver, "TC01_verifyLoginFunctionally");
		  
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			  
		  LoginPOMClass lp =new LoginPOMClass(driver);
		 lp.sendusername();
		 log.info("enter username");
		 lp.sendpassword();
		 log.info("enter password");
		 lp.clickloginbutn();
		 log.info("click on loginbutn");
		 log.info("went to home page");
		 
		 UtilityClass.screenshotMethod(driver,"TC01_loginpageScreenshot");
 
}


		  @AfterMethod
			  public void teardown()
			  {
			 driver.close();
			 log.info("browser is closed");
			 log.info("end of the program");
			  }
}
	
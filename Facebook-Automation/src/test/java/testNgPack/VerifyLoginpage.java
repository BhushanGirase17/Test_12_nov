package testNgPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page.Loginpage;

public class VerifyLoginpage {
	
	WebDriver driver;
	Loginpage loginpage;

	 @BeforeClass
	 public void beforeClass() {
		 System.out.println("Before Class");
		 
		 System.setProperty("webdriver.chrome.driver","D:\\Testing Classes\\Automation\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe" );
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");	
				
		 driver = new ChromeDriver(options);

	 }
	
	 @BeforeMethod
	 public void beforeMethod() {
		 
		    System.out.println("Before Method");
		 
		    driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
		    loginpage = new Loginpage (driver);
		    
			
	 }
	
	 @Test (priority = 1)
	 public void test() {
		 System.out.println("Test");
		 
		 loginpage.sendusername();
		 loginpage.sendpassword();
		 loginpage.clickonloginbutton();
//		 loginpage.clickonforgotpassword();
//		 loginpage.clickonCreatnewacc();
		 
		 
	 }
	 
	 @Test (priority = 2)
	 public void test2() {
		 
		 System.out.println("Blank");
		 
	 }
	 @Test (priority = 1)
	 public void test3() {
		 
		// loginpage.clickonloginbutton();
	 }
	 @AfterMethod
	 public void afterMethod() {
		 System.out.println("After Method");
		 
		 
	 }
	 
	 @AfterClass
	 public void afterClass() {
		 System.out.println("After Class");
	 }
	
	
	
	
	
	
	
	
	
}

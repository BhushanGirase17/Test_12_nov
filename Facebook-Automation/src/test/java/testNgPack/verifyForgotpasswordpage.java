package testNgPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Module.Forgotpasswordpage;
import Page.Loginpage;

public class verifyForgotpasswordpage {
	
	 
	WebDriver driver ;
	Loginpage loginpage;
	Forgotpasswordpage forgotpasswordpage;
	
	 @BeforeClass
	 public void openBrowser() 
	 {
		 System.setProperty("webdriver.chrome.driver","D:\\Testing Classes\\Automation\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe" );
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");	
				
		 driver = new ChromeDriver(options);
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 }

	 @BeforeMethod
	 public void goToForgotpasswordpage()
	 {
	 
	    driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	    loginpage = new Loginpage (driver);
	    loginpage.clickonforgotpassword();
	    
	    forgotpasswordpage = new Forgotpasswordpage(driver);
	    
     } 
	 
	 @Test 
	 public void verifyMessageonForgotpasswordpage() {
	 
		String actualMessage = forgotpasswordpage.getEntertext();
		String expectedMessage = "Please enter your email address or mobile number to search for your account.";
		 if(actualMessage.equals(expectedMessage))
		 {
			 System.out.println("PASSED");
		 }
		 else
		 {
			 System.out.println("FAILED");
		 }
		 
	 }
	 
	 @Test
	 public void verifyCancelButtononForgotpasswordpage () {
	   
		// System.out.println("======");
		 forgotpasswordpage.clickoncancelbutton();
		 String expectedUrl = "https://www.facebook.com/login.php";
		 String expectedTitle =  "Log in to Facebook";
		 String actualUrl = driver.getCurrentUrl();
	     String actualTitle = driver.getTitle();
	     
	     if(expectedUrl.equals(actualUrl)&& expectedTitle.equals(actualTitle) )
	     {
	    	 System.out.println("PASSED"); 
	     }
	     else
	     {
	    	 System.out.println("FAILED");
	     }
	     
	     
	 }
	 @Test
	 public void verifySerachfuctiononForgotpasswordpage () {
		 forgotpasswordpage.sendemailormobileno();
		 forgotpasswordpage.clickonsearchbutton();
		 
		 String expectedErrorTitle = "No search results";
	     String expectedErrorMessage = "Your search did not return any results. Please try again with other information.";
	     String acutalErrorTitle = forgotpasswordpage.getErrorTitle();
	     String acutalErrorMessage = forgotpasswordpage.getErrorMessage();
	    
	     if(expectedErrorTitle.equals(acutalErrorTitle)&& acutalErrorMessage.equals(acutalErrorMessage) )
	     {
	    	 System.out.println("PASSED");  	 
	     }
	     else 
	     {
	    	 System.out.println("FAILED");
	    	 
	     }
	   
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
	



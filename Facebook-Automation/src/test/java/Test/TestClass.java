package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page.Loginpage;

public class TestClass {
	
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "D:\\Testing Classes\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
	//  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
				
	  driver.get("https://www.facebook.com/");
	  
	  driver.manage().window().maximize();
	  
	  System.out.println("practise for git");
		 System.out.println("practise for git");
		 System.out.println("practise for git");
		 System.out.println("practise for git");
		

	  Loginpage loginpage = new Loginpage(driver);
	  loginpage.sendusername();
	  loginpage.sendpassword();
	  Thread.sleep(2000);
	  loginpage.clickonloginbutton();
	
	
	
	
	
	
	
	
	  
	  
	
	}
	
	

}

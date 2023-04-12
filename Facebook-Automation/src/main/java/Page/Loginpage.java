package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	
	// Variable Declaration
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement Username ;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement Password ;

	@FindBy(xpath="//button[@name='login']")
	private WebElement LoginButton ;

	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement ForgotPassword ;

	@FindBy(xpath="//a[text() ='Create new account']")
	private WebElement Creatnewacc ;
	
	// Variable Declaration
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	// variable use 
	
	public void sendusername() {
		Username.sendKeys("9075115439");
	}
	
	public void sendpassword() {
		Password.sendKeys("9789899");
	}
   
	public void clickonloginbutton() {
		LoginButton.click();
	}
	
	public void clickonforgotpassword() {
		ForgotPassword.click();
	}
	
	public void clickonCreatnewacc() {
		Creatnewacc.click();
	}
	 
	//when u r login into facebook so three login elements call in one method 
	
	public void loginpage() {
		Username.sendKeys("9075115439");
		Password.sendKeys("9422795936");
		LoginButton.click();
	}
	
	
	
	
	
	
	
	
}

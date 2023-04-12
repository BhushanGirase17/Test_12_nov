package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpasswordpage {
	
	
	@FindBy(xpath = "//div[text()='Please enter your email address or mobile number to search for your account.']")
	private WebElement getEntertext	;
	
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement emailormobileno;
	
	@FindBy(xpath = "(//a[@role='button'])[1]")
	private WebElement cancelbutton;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchbutton;
	
	@FindBy (xpath = "//div[text() ='No search results']")
	private WebElement getErrorTitle;
	
	@FindBy (xpath = "//div[text() ='Your search did not return any results. Please try again with other information.']")
	private WebElement getErrorMessage;
	
	public Forgotpasswordpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getEntertext() {
	String gettext =getEntertext.getText();
    return gettext ;		
	}
	
	
	public void sendemailormobileno() {
		emailormobileno.sendKeys("vjhvjjuyb");
	}
	
	public void clickoncancelbutton() {
		cancelbutton.click();
	}
	
	public void clickonsearchbutton() {
		searchbutton.click();
	}
	
	public void Forgotpasswordpage() {
		emailormobileno.sendKeys("9075115439");
		searchbutton.click();
	}	
	
	public String getErrorTitle() {
	String gettext =	getErrorTitle.getText();
	return gettext ;
	}	
	
	public String getErrorMessage() {
		String gettext = getErrorMessage.getText();
		return gettext ;
	}
}
	
	
	
	
	
	
	
	
	



package Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class signuppage {
	
	@FindBy (xpath="(//input[@type='text'])[2]")
     private WebElement FirstName;
	
	@FindBy (xpath="(//input[@type='text'])[3]")
    private WebElement Surname;
	
	@FindBy (xpath="(//input[@data-type=\\\"text\\\"])[3]")
    private WebElement mobileorEmail;
	
	@FindBy (xpath="//input[@id='password_step_input']")
    private WebElement Newpassword;
	
	
	@FindBy (xpath="//select[@id='day']")
    private WebElement DayofBirth;
	
	@FindBy (xpath="//select[@id='month']")
    private WebElement Birthofmonth;
	
	@FindBy (xpath="//select[@id='year']")
    private WebElement BirthofYear;
	
	@FindBy (xpath="(//input[@type='radio'])[2]")
    private WebElement maleRadiobutton;
	
	@FindBy (xpath=" //(//button[@type='submit'])[2]")
    private WebElement  Signupbutton;
	
	WebDriver driver;
	
	public signuppage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void sendFirstName() {
		FirstName.sendKeys("Bhushan");
	}
	
	public void sendSurname() {
		Surname.sendKeys("Girase");
	}
	
	public void sendmobileorEmail() {
		mobileorEmail.sendKeys("86535358375935");
	}
	
	public void sendNewpassword() {
		Newpassword.sendKeys("Bhushan");
	}
	
	public void selectDayofBirth() {
		  Select d = new Select (DayofBirth);
		  d.selectByVisibleText("17");
	}
	
	public void selectBirthofmonth() {
		 Select m = new Select (Birthofmonth);
		  m.selectByVisibleText("Jun");
	}
	
	public void selectBirthofYear() {
		 Select y = new Select (BirthofYear);
		  y.selectByVisibleText("2000");
	}
	
	public void selectmaleRadiobutton() {
		 Actions action = new Actions(driver);
		  action.moveToElement(maleRadiobutton).click().build().perform();
	}
	
	public void clickonSignupbutton() {
		Signupbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

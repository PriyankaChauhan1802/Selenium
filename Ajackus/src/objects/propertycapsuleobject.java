package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class propertycapsuleobject {

	
	WebDriver driver;
	public propertycapsuleobject(WebDriver driver) {

	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
			
		//Page Factory
		@FindBy (xpath="//*[text()='Sign Up']") 
		WebElement signup;
	
		public WebElement signup() {
		return signup;
		}
		@FindBy (xpath="//input[@name='email']") 
		WebElement emailid;
		
		public WebElement emailid() {
			return emailid;
		}
		@FindBy (xpath="//input[@name='password']") 
		WebElement password;
		
		public WebElement password() {
			return password;
		}
		@FindBy (xpath="//div[contains(@class,'login-signup-btn')]") 
		WebElement cont;
		
		public WebElement cont() {
			return cont;
		}
		@FindBy (xpath="//input[contains(@class,'sign-up-name-input')]") 
		WebElement fullname;
		
		public WebElement fullname() {
			return fullname;
		}
		@FindBy (xpath="//input[@formcontrolname='companyName']") 
		WebElement company;
		
		public WebElement company() {
			return company;
		}
		@FindBy (xpath="//input[@formcontrolname='phoneNumber']") 
		WebElement phone;
		
		public WebElement phone() {
			return phone;
		}
		@FindBy (xpath="//div[contains(@class,'send-code')]") 
		WebElement code;
		
		public WebElement code() {
			return code;
		}

}

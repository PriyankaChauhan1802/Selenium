package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signupobject {
	
	WebDriver driver;
	public signupobject(WebDriver driver) {

	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	//Page object pattern
		By signuplink = By.id("ember502");
		
		public WebElement signuplink() {
			return driver.findElement(signuplink);
		}
		By fullname = By.id("ember843"); 
		public WebElement fullname() {
			return driver.findElement(fullname);
		}
		
 
		
		//Page Factory
		@FindBy (id="ember844") 
		WebElement emailid;
		
		public WebElement emailid() {
			return emailid;
		}
		@FindBy (id="ember845") 
		WebElement phone;
		
		public WebElement phone() {
			return phone;
		}
		@FindBy (id="ember846") 
		WebElement password;
		
		public WebElement password() {
			return password;
		}
		@FindBy (id="ember847") 
		WebElement confirmpassword;
		
		public WebElement confirmpassword() {
			return confirmpassword;
		}
		@FindBy (id= "btn-login")
		WebElement signupclick;
		
		public WebElement signupclick() {
			return signupclick;
		}
		
		
}



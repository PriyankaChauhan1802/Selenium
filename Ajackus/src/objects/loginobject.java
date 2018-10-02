package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginobject {
	
WebDriver driver;
	public loginobject(WebDriver driver) {

	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	//Page object pattern
		By loginlink = By.id("ember501");
		
		public WebElement loginlink() {
			return driver.findElement(loginlink);
		}
		By username = By.id("email"); 
		public WebElement username() {
			return driver.findElement(username);
		}
		
 
		
		//Page Factory
		@FindBy (id="password") 
		WebElement password;
		
		public WebElement password() {
			return password;
		}
		
		@FindBy (id= "btn-login")
		WebElement loginclick;
		
		public WebElement loginclick() {
			return loginclick;
		}
		
		
		
		
}

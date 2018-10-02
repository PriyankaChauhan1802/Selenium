package PropertyCapsule;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import objects.propertycapsuleobject;

public class validations3 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//exiting the sign up pop up
		browserinvocationPC ob1 = new browserinvocationPC();
		
		WebDriver driver=ob1.initializing();
		driver.navigate().to("https://dev.maps.propertycapsule.com/map/sign-up");
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		//propertycapsuleobject ob = new propertycapsuleobject(driver);
		//ob.signup().click();
		WebDriverWait d= new WebDriverWait(driver, 5);
		d.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("already-have-account-link"))));
		driver.findElement(By.className("already-have-account-link")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.className("login-signup-header")).getText());
		if(driver.findElement(By.className("login-signup-header")).getText().equals("Welcome Back!"))
		{
		System.out.println("clicked on signup");
		}
		else
		{
			System.out.println("Did not clicked on signup");
		}
		System.out.println(driver.getCurrentUrl());
		d.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='signin-up-modal-container']/div/i"))));	
	driver.findElement(By.xpath("//div[@class='signin-up-modal-container']/div/i")).click();
	System.out.println("pop up closed");
	//if required screenshot step can be added 
	Thread.sleep(5000);
	driver.close();
}
}
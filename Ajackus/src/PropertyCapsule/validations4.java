package PropertyCapsule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import objects.propertycapsuleobject;

public class validations4 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		browserinvocationPC ob1 = new browserinvocationPC();
		WebDriver driver=ob1.initializing();
		propertycapsuleobject ob = new propertycapsuleobject(driver);
		
		ob.signup().click();
		ob.emailid().sendKeys("asd");
		ob.password().sendKeys("asd");
		ob.cont().click();
		String emailvalidation=driver.findElement(By.xpath("//div[@class='email']/span")).getText();
		String passwordvalidation=driver.findElement(By.xpath("//div[@class='form-field']/span")).getText();
		if(emailvalidation.equals("EMAIL IS INVALID")&passwordvalidation.equals("PASSWORD SHOULD BE OF AT LEAST 6 CHARACTERS"))
		{
			System.out.println("proper validations");
		
		}
		else
		{
			System.out.println("improper validations");
				}
	
}
}

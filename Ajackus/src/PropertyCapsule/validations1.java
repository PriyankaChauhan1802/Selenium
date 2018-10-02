package PropertyCapsule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import objects.propertycapsuleobject;

public class validations1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//password and email required validation
		browserinvocationPC ob1 = new browserinvocationPC();
		
		WebDriver driver=ob1.initializing();
		propertycapsuleobject ob = new propertycapsuleobject(driver);
		ob.signup().click();
		ob.cont().click();
		String emailvalidation=driver.findElement(By.xpath("//div[@class='email']/span")).getText();
		String passwordvalidation=driver.findElement(By.xpath("//div[@class='form-field']/span")).getText();
		if(emailvalidation.equals("EMAIL IS REQUIRED")&passwordvalidation.equals("PASSWORD IS REQUIRED"))
		{
			System.out.println("proper validations");
		
		}
		else
		{
			System.out.println("improper validations");
				}
		Thread.sleep(5000);
		driver.close();
	}
	
	

}

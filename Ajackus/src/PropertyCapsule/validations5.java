package PropertyCapsule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import objects.propertycapsuleobject;

public class validations5 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//Proper password validation
		browserinvocationPC ob1 = new browserinvocationPC();
		WebDriver driver=ob1.initializing();
		propertycapsuleobject ob = new propertycapsuleobject(driver);
		
		ob.signup().click();
		ob.emailid().sendKeys("asd@asd.com");
		ob.password().sendKeys("asdasd");
		ob.cont().click();
		String passwordvalidation=driver.findElement(By.xpath("//div[@class='form-field']/span")).getText();
		if(passwordvalidation.equals("PASSWORD SHOULD HAVE CHARACTER AND NUMBER"))
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

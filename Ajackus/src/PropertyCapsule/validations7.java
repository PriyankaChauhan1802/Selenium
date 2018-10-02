package PropertyCapsule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import objects.propertycapsuleobject;

public class validations7 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

browserinvocationPC ob1 = new browserinvocationPC();
		
		WebDriver driver=ob1.initializing();
		propertycapsuleobject ob = new propertycapsuleobject(driver);
		ob.signup().click();
		Thread.sleep(5000);
		//driver.findElement(By.linkText("terms of services.")).click();
		//driver.findElement(By.className("underline-link")).click();
		driver.findElement(By.xpath("//div[@class='signup-footer']/div[2]/span")).click();
		Thread.sleep(5000);
		if(driver.getCurrentUrl().equals("https://dev.maps.propertycapsule.com/map/sign-up/terms-conditions"))
				{
			System.out.println("Successful");
				}
		else
		{
			System.out.println("Unsuccessful");
		}
	}

}

package PropertyCapsule;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import objects.propertycapsuleobject;

public class validations2 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		//full name company name and cee number required validation
		Properties property=new Properties();
		FileInputStream filelocation=new FileInputStream("C:\\Users\\Priyanka\\eclipse-workspace\\Ajackus\\src\\PropertyCapsule\\signuppc.properties");
		property.load(filelocation);
		
		String email=property.getProperty("email");
		String password=property.getProperty("password");
		
		browserinvocationPC ob1 = new browserinvocationPC();
		
		WebDriver driver=ob1.initializing();
		propertycapsuleobject ob = new propertycapsuleobject(driver);
		ob.signup().click();
		ob.emailid().sendKeys(email);
		ob.password().sendKeys(password);
		ob.cont().click();
		Thread.sleep(3000);
		ob.code().click();
		String fullnamevalidation=driver.findElement(By.xpath("//div[@class='fullName']/span")).getText();
		String companynamevalidation=driver.findElement(By.xpath("//div[@class='companyName']/span")).getText();
		String cellnumbervalidation=driver.findElement(By.xpath("//div[@class='phoneNumber']/span")).getText();
		if(fullnamevalidation.equals("FULL NAME IS REQUIRED")&companynamevalidation.equals("COMPANY NAME IS REQUIRED")&cellnumbervalidation.equals("CELL NUMBER IS REQUIRED"))
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
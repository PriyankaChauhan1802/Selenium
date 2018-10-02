package PropertyCapsule;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import objects.propertycapsuleobject;

public class SignupPC {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Properties property=new Properties();
		FileInputStream filelocation=new FileInputStream("C:\\Users\\Priyanka\\eclipse-workspace\\Ajackus\\src\\PropertyCapsule\\signuppc.properties");
		property.load(filelocation);
		
		String email=property.getProperty("email");
		String password=property.getProperty("password");
		String fullname=property.getProperty("fullname");
		String companyname=property.getProperty("companyname");
		String cellphone=property.getProperty("cellphone");
		String screenshot=property.getProperty("screenshot");
		
		browserinvocationPC ob1 = new browserinvocationPC();
		
		WebDriver driver=ob1.initializing();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//page object
				propertycapsuleobject ob = new propertycapsuleobject(driver);
				
				ob.signup().click();
				ob.emailid().sendKeys(email);
				ob.password().sendKeys(password);
				ob.cont().click();
				Thread.sleep(3000);
				ob.fullname().sendKeys(fullname);
				ob.company().sendKeys(companyname);
				ob.phone().sendKeys(cellphone);
				ob.code().click();
				Thread.sleep(5000);
				File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src,new File(screenshot));			
				driver.close();
				

	}

}

package visaguide;

import java.io.File;
import java.io.FileInputStream; 
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

import objects.loginobject;
import objects.signupobject;

public class SignUp extends browserinvocation{

	
	public static void main(String[] args) throws IOException {
		Properties property=new Properties();
		FileInputStream filelocation=new FileInputStream("C:\\Users\\Priyanka\\eclipse-workspace\\Ajackus\\src\\visaguide\\signup.properties");
		property.load(filelocation);
		String fullname = property.getProperty("fullname");
		String email=property.getProperty("email");
		String phonenumber = property.getProperty("phonenumber");
		String password=property.getProperty("password");
		String confirmpassword = property.getProperty("confirmpassword");
		String screenshot = property.getProperty("screenshot");
		WebDriver driver;
		browserinvocation ob1=new browserinvocation();
		driver = ob1.initializing();
		
		//wihtout page object
		
		/*
		WebElement signup =driver.findElement(By.id("ember502"));
		signup.click();
		System.out.println("Signup link is clicked");
		WebElement name =driver.findElement(By.id("ember843"));
		name.sendKeys(fullname);
		System.out.println("fullname entered");
		WebElement emailid =driver.findElement(By.id("ember844"));
		emailid.sendKeys(email);
		System.out.println("email entered");
		WebElement phone =driver.findElement(By.id("ember845"));
		phone.sendKeys(phonenumber);
		System.out.println("phone number entered");
		WebElement pass =driver.findElement(By.id("ember846"));
		pass.sendKeys(password);
		System.out.println("password entered");
		WebElement confirmpass =driver.findElement(By.id("ember847"));
		confirmpass.sendKeys(confirmpassword);
		System.out.println("password entered");
		WebElement signupbutton =driver.findElement(By.id("btn-login"));
		signupbutton.click();
		System.out.println("sign up clicked");
		
		*/
		
		//page object
				signupobject ob = new signupobject(driver);
				
				 ob.signuplink().click();
				 ob.fullname().sendKeys(fullname);
				 ob.emailid().sendKeys(email);
				 ob.phone().sendKeys(phonenumber);
				 ob.password().sendKeys(password);
				 ob.confirmpassword().sendKeys(confirmpassword);
				 ob.signupclick().click();
				 
				 File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(src,new File(screenshot));
				 driver.close();
				 
				
	}

}

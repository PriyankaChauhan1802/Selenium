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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import objects.loginobject;


public class Login extends browserinvocation {
	

	public static void main(String[] args) throws IOException, InterruptedException  {
		WebDriver driver ;
		Properties property=new Properties();
		FileInputStream filelocation=new FileInputStream("C:\\Users\\Priyanka\\eclipse-workspace\\Ajackus\\src\\visaguide\\login.properties");
		property.load(filelocation);
		String username = property.getProperty("username");
		String pass=property.getProperty("password");
		String screenshot=property.getProperty("screenshot");
		
		browserinvocation ob1=new browserinvocation();
		driver = ob1.initializing();
		
		 //without page object
		
		/*
		WebElement login =driver.findElement(By.id("ember501"));
		
		login.click();
		System.out.println("Login link is clicked");
		WebElement email =driver.findElement(By.id("email"));
		email.sendKeys(username);
		System.out.println("email entered");
		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys(pass);
		System.out.println("password entered");
		WebElement signin =driver.findElement(By.id("btn-login"));
		signin.click();
		System.out.println("sign in clicked");
		
		*/
		
		//page object
		loginobject ob = new loginobject(driver);
		
		ob.loginlink().click();
		System.out.println("Login link is clicked");
		ob.username().sendKeys(username);
		System.out.println("email entered");
		ob.password().sendKeys(pass);
		System.out.println("password entered");		
		ob.loginclick().click();
		System.out.println("Submitted");
		WebDriverWait d= new WebDriverWait(driver, 5);
		//wait for logout link
		d.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(@class,'margin-right-0')]"))));
		Thread.sleep(5000);
		System.out.println("Login Successful");
		File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(screenshot));
		Thread.sleep(3000);
		driver.close();
	}
}

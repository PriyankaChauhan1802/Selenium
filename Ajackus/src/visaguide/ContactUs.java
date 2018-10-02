package visaguide;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class ContactUs {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties property=new Properties();
		FileInputStream filelocation=new FileInputStream("C:\\Users\\Priyanka\\eclipse-workspace\\Ajackus\\src\\visaguide\\contactus.properties");
		property.load(filelocation);
		String fullname = property.getProperty("fullname");
		String email=property.getProperty("email");
		String phone = property.getProperty("phone");
		String message=property.getProperty("message");
		String nationality=property.getProperty("nationality");
		String from=property.getProperty("from");
		String to=property.getProperty("to");
		String purpose=property.getProperty("purpose");
		String screenshot=property.getProperty("screenshot");
		// TODO Auto-generated method stub
		WebDriver driver;
		
		browserinvocation ob2=new browserinvocation();
		 driver = ob2.initializing();
		 Actions ob1=new Actions(driver);
		 
		driver.findElement(By.className("menu-btn")).click();
		driver.findElement(By.id("ember491")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("ember877")).sendKeys(fullname);
		ob1.click(driver.findElement(By.id("ember878"))).sendKeys(nationality).build().perform();
		driver.findElement(By.id("ember881")).sendKeys(email);
		driver.findElement(By.id("ember886")).sendKeys(phone);
		ob1.click(driver.findElement(By.id("ember887"))).sendKeys(from).build().perform();
		ob1.click(driver.findElement(By.id("ember888"))).sendKeys(to).build().perform();
		ob1.click(driver.findElement(By.id("ember889"))).sendKeys(purpose).build().perform();
		ob1.click(driver.findElement(By.id("ember892"))).sendKeys(message).build().perform();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		//verifying successful submission
		if(driver.findElement(By.xpath("//div[@class='side-margin-10']/div/h2")).getText().equals("Testimonials"))
				{
			System.out.println("Successful");
				}
		else
		{
			System.out.println("Unsuccessful");
		}
		File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(screenshot));
		Thread.sleep(5000);
		driver.close();
	}

}

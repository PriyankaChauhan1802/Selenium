package PropertyCapsule;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	
	public class browserinvocationPC {
		public WebDriver driver;
		
		public WebDriver initializing() throws IOException
		{

			Properties property=new Properties();
			FileInputStream filelocation=new FileInputStream("C:\\Users\\Priyanka\\eclipse-workspace\\Ajackus\\src\\PropertyCapsule\\browserPC.properties");
			property.load(filelocation);
			String url=property.getProperty("url");
			String browser = property.getProperty("browser");
			String chromeexelocation=property.getProperty("chromeexelocation");
			String firefoxexelocation=property.getProperty("firefoxexelocation");
			String ieexelocation=property.getProperty("ieexelocation");
			
			if(browser.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",  firefoxexelocation );
				driver = new FirefoxDriver();
				driver.get(url);
				driver.manage().window().maximize();
			}
			else if (browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", chromeexelocation);
				driver = new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
			}
			else if(browser.equals("ie"))
			{
				System.setProperty("webdriver.ie.driver", ieexelocation);
				driver = new InternetExplorerDriver();
				driver.get(url);
				driver.manage().window().maximize();
			}
			
			return driver;
	}
		
	}
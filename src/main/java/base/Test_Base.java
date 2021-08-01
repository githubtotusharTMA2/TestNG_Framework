package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.Test_Utils;

public class Test_Base
{
	// Step 1 - Global Variables -
	public static WebDriver driver;
	public static Properties prop;
	
	// Step 2 - Constructor -
	public Test_Base()
	{
		try
		{
			FileInputStream fis = new FileInputStream("E:\\QA_Infotech\\Training_Works\\Eclipse\\Workspace_2\\Projects\\TestNG_Framework\\src\\main\\java\\config\\config.properties");
			prop = new Properties();
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception = " + e.getMessage());
		}
	}
	
	// Step 3 - Initialization method -
	public void initialization(String url)
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Utils\\Selenium_browser_drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\QA_Infotech\\Training_Works\\Eclipse\\Utils\\Selenium_browser_drivers\\geckodriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Test_Utils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Utils.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		
		if(url == "")
			driver.get(prop.getProperty("url"));
		else
			driver.get(url);
	}
}

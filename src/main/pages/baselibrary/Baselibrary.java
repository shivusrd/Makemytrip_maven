package baselibrary;

import java.io.File;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.w3c.dom.html.HTMLUListElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.relevantcodes.extentreports.model.Log;

import pages.Makemytrip_launch_page;
import propertyutility.PropertyUtility;
import screenshotutility.ScreenshotUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;




public class Baselibrary 
{

public static WebDriver driver;
public static Reporter reporter;
public Reporter rep = new Reporter();
public static  Logger logger = LogManager.getLogger(Baselibrary.class);

	


    public void getlaunchchrome ()
	{
    	logger.info("Starting Chrome Browser");
       
    	driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
    

    public void getlaunchfirefox ()
	{
    	logger.info("Starting Firefox Browser");
    	//System.setProperty("webdriver.gecko.driver","C:\\Users\\shivam.dubey\\git\\Makemytrip_maven\\geckodriver.exe");
=======
    public void getlaunch2 ()
	{
    	logger.info("Starting firefox Browser");
       

    	driver = new FirefoxDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
    
    public void homepage()
    {
    	
    	driver.navigate().to(PropertyUtility.getreadproperty("makemytrip"));
    }
    @Parameters({ "browser" })
	@AfterTest
	
<<<<<<< HEAD
	public void Teardown(String browser)
	{   if(browser.equalsIgnoreCase("firefox")) {
		 
		     //Initializing the firefox driver (Gecko)
		     logger.info("Closing Firefox Browser");

		  }else if (browser.equalsIgnoreCase("chrome")) { 

			  //Initialize the chrome driver

			  logger.info("Closing Chrome Browser");

		  } 
		
=======
	public void Teardown()
	{   
		logger.info("Closing Chrome Browser");
>>>>>>> 9ad6e1362f90b0f13bb2566a1e49b01894c640c4
		driver.quit();
	}
	
	
	
	
	
	
//	@AfterMethod
//	public void analysis(ITestResult result)
	
//	{
//		String methodname = result.getMethod().getMethodName();
//		if(result.isSuccess())
//		{
//			
//			ScreenshotUtility.getscreenshot("PASSED", methodname);
//		}
		
//		if (result.getStatus()==ITestResult.FAILURE)
//		
//		{
//			ScreenshotUtility.getscreenshot("FAILED", methodname);
//		}
//		
//		else if (result.getStatus()==ITestResult.SKIP)
//			
//		{
//			ScreenshotUtility.getscreenshot("SKIP", methodname);
//		}
//		
//	}
			
	public void getScreenshot(String result) throws IOException 
	{
		
		
		File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(srcFile, new File("C://screenshotTest//" + result + "screenshot.png"));

	}
	
	
	
	
	
}

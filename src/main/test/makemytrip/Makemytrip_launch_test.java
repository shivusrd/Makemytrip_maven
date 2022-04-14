package makemytrip;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;

import pages.Makemytrip_launch_page;
import propertyutility.PropertyUtility;

public class Makemytrip_launch_test extends Baselibrary


{
	Makemytrip_launch_page ob;
	@Parameters({"browser"})
	
	@BeforeTest

	public void launchFB(String browser) 
	{
		String url = PropertyUtility.getreadproperty("makemytrip");
		// If the browser is Firefox, then do this

		  if(browser.equalsIgnoreCase("firefox")) {
			 
		//Initializing the firefox driver (Gecko)
			  getlaunch2(); 

		  }else if (browser.equalsIgnoreCase("chrome")) { 

			  //Initialize the chrome driver

			  getlaunch();

		  } 
		
		driver.get(url);

		ob = new Makemytrip_launch_page();
	}

	@Test(priority = 0)
	public void SendValidNumber_Test01() throws InterruptedException

	{
	   ob.makemytrip_login();
		

	}

	
	@Test(priority = 1)
	public void SendINValidNumber_Test02() throws InterruptedException

	{
		
		ob.makemytrip_booking();
		

	}



}

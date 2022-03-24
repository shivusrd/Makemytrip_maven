package makemytrip;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Makemytrip_Bookhotel;
import pages.Makemytrip_launch_page;
import propertyutility.PropertyUtility;

public class Makemytrip_Bookhotel_test extends Baselibrary{
	
		Makemytrip_Bookhotel ob;
		
		@BeforeTest

		public void launchFB() {
			String url = PropertyUtility.getreadproperty("makemytrip");
			getlaunch();
			driver.get(url);

			ob = new Makemytrip_Bookhotel();
		}

		
		@Test(priority = 0)
		public void clickonhotel() throws InterruptedException
		{
			ob.clickonplace();
			
		}
		
		/*@Test(priority = 1)
		public void clickonplace()
		{
			ob.clickonplace();
		}
		@Test(priority = 2)
		public void clickondate()
		{
			ob.clickondate();
		}*/
}

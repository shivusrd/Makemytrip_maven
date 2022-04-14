package makemytrip;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.Makemytrip_TrainBook_page;
import pages.Makemytrip_launch_page;
import propertyutility.PropertyUtility;

public class Makemytrip_TrainBook_test extends Baselibrary



{
	
	Makemytrip_TrainBook_page ob;
	
	@BeforeTest

	public void launch_makemytrip() {
		String url = PropertyUtility.getreadproperty("makemytrip");
		getlaunchchrome();
		driver.get(url);

		ob = new Makemytrip_TrainBook_page();
	}

	@Test(priority = 0)
	public void BookTrainTicket_Test01() throws InterruptedException

	{
	     ob.booktrain_ticket();
		

	}

	
	

public static void main(String[] args) {
	
}



}

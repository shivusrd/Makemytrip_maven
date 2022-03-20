package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationutility.Applicationutility;
import baselibrary.Baselibrary;

public class Makemytrip_Bookhotel extends Baselibrary
{
	public  Makemytrip_Bookhotel() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@class='langCardClose']")
	private WebElement closebtn;
	
	@FindBy(css = ".makeFlex.hrtlCenter.font10.makeRelative.lhUser.userLoggedOut")
	private WebElement login3;
	
	@FindBy(xpath = "//span[@class='false chNavText darkGreyText'][normalize-space()='Hotels']")
	private WebElement hotel;
	
	
	@FindBy(xpath = "//input[@placeholder='Enter city/ Hotel/ Area/ Building']")
	private WebElement chooseplace;
	
	@FindBy(xpath="//button[@id='hsw_search_button']")
	private WebElement searchbtn;
	
	@FindBy(xpath = "//div[@aria-label='Sat Mar 26 2022']")
	private WebElement choosedate;
	
	@FindBy(xpath = "//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected DayPicker-Day--disabled']")
	private WebElement checkoutdate;
	
	
	
	
	public void clickonhotel() {
		
		closebtn.click();
		login3.click();
		hotel.click();
		searchbtn.click();
	}
	
	
	/*public void clickonplace() {
		chooseplace.click();
		Applicationutility.selectbyvisibletext(hotel, "Goa");	
	}
	
	public void clickondate() {
		choosedate.click();
	}*/
	
}

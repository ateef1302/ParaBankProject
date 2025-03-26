package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetLogin extends BasePage{

	public ForgetLogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	@FindBy(xpath="//a[normalize-space()='Forgot login info?']") WebElement linklogin;
@FindBy(xpath="//input[@id='firstName']") WebElement fname;
@FindBy(xpath="//input[@id='lastName']") WebElement lname;
@FindBy(xpath="//input[@id='address.street']") WebElement adrstreet;
@FindBy(xpath="//input[@name='address.city']") WebElement adrcity;
@FindBy(xpath="//input[@id='address.state']")WebElement adrstate;
@FindBy(xpath="//input[@id='address.zipCode']")WebElement zip;
@FindBy(xpath="//input[@id='ssn']") WebElement numsocial;
@FindBy(xpath="//input[@value='Find My Login Info']") WebElement btnlohin;



public void loginLink()
{
	
	linklogin.click();

}
	
	public void FirstName(String name)
	{
		fname.sendKeys(name);
	}
	
	public void LastName(String surname)
	{
		lname.sendKeys(surname);
	}
	
	public void StreetAdress(String adr)
	{
		adrstreet.sendKeys(adr);
	}
	
	public void City(String city)
	{
		adrcity.sendKeys("city");
	}
	
	
	
	public void State(String state)
	{
		adrstate.sendKeys(state);
	}
	
	public void Zipcode(String adrzip)
	{
		zip.sendKeys(adrzip);
	}
	
	public void SSN(String ssn)
	{
		numsocial.sendKeys(ssn);
	}
	
	public void btnlogininfo()
	{
		btnlohin.click();
	}
	
	
}

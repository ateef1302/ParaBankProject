package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends BasePage{

	public Registration(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement reg;
	
	


	@FindBy(xpath="//input[@id='customer.firstName']") WebElement fname;
	@FindBy(xpath="//input[@id='customer.lastName']") WebElement lname;
	@FindBy(xpath="//input[@id='customer.address.street']") WebElement addr;
	@FindBy(xpath="//input[@id='customer.address.city']") WebElement city;
	@FindBy(xpath="//input[@id='customer.address.state']")WebElement state;
	@FindBy(xpath="//input[@id='customer.address.zipCode']")WebElement zip;
@FindBy(xpath="//input[@id='customer.phoneNumber']") WebElement cell;
	@FindBy(xpath="//input[@id='customer.ssn']") WebElement ssn;
	@FindBy(xpath="//input[@id='customer.username']") WebElement user;
	@FindBy(xpath="//input[@id='customer.password']") WebElement pwd;
@FindBy(xpath="//input[@id='repeatedPassword']") WebElement cpwd;
	@FindBy(xpath="//input[@value='Register']") WebElement butn;
	
	
	public void registrationlink()
	{
		reg.click();
	}
	
	public void firstName(String name)
	{
		fname.sendKeys(name);
	}
	
	public void lastname(String l_name)
	{
		lname.sendKeys(l_name);
	}
	
	public void Address(String add)
	{
		addr.sendKeys(add);
	}
	
	public void Cityname(String area)
	{
		city.sendKeys(area);
	}
	
	public void Statename(String stat)
	{
		state.sendKeys(stat);
	}
	
	
	public void Zipcode(String zipo)
	{
		zip.sendKeys(zipo);
	}
	
	
	
	public void phoneNumber(String phn)
	{
		cell.sendKeys(phn);
	}
	
	public void socialsecuritynumber(String num)
	{
		ssn.sendKeys(num);
	}
	
	public void UserName(String usr)
	{
		user.sendKeys(usr);
	}
	
	public void password(String pass)
	{
		pwd.sendKeys(pass);
	}
	
	
	public void confirmpassword(String pass)
	{
		cpwd.sendKeys(pass);
	}
	
	
	public void butnRegistration()
	{
		butn.click();
	}
	
	
	
	
	
}

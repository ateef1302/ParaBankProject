package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage{

	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	







@FindBy(xpath="//input[@name='username']") WebElement user;
@FindBy(xpath="//input[@name='password']") WebElement pass;
@FindBy(xpath="//input[@value='Log In']") WebElement login;




public void Userdetails(String usr)
{
	user.sendKeys(usr);

}

public void userPassword(String pwd)
{
	
pass.sendKeys(pwd);
}

public void butnLogin()
{
	
login.click();
}











}

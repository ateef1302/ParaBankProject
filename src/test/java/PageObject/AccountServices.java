package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountServices extends BasePage{

	public AccountServices(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
                /*TC1_Opening new Account*/
	@FindBy (xpath="//a[normalize-space()='Open New Account']") WebElement act;
	@FindBy(xpath="//select[@id='type']")WebElement selct;
	@FindBy(xpath="//select[@id='fromAccountId']")WebElement extAct;
	@FindBy(xpath="//input[@value='Open New Account']") WebElement btnCreateAct;
	
	          /*TC2_Reviewing the Account*/
	@FindBy (xpath="//a[normalize-space()='Accounts Overview']") WebElement view;

	@FindBy(xpath="//table[@id='accountTable']//tr[2]//td[1]") WebElement table;
	
	
	
	/*TC3_Transfer Fund */

@FindBy(xpath="//a[normalize-space()='Transfer Funds']") WebElement TransFun;
@FindBy(xpath="//input[@id='amount']") WebElement amt;
@FindBy(xpath="//input[@value='Transfer']")WebElement btnTrans;
	
	












	public void NewAccountOpening() {
		
		act.click();
	}
	
	public void SelectAccountType()
	{
		Select drp=new Select (selct);
		drp.selectByValue("SAVING");
	}
	
	public void ExistingAccount()
	{
		extAct.click();
	}
	
	public void CreateAccountbtn()
	{
		btnCreateAct.click();
	}
	
	
	/*****TC2****/
	
	public void OverView()
	{
		view.click();
	}
	
	public String AccountInfo()
	{
		try
		{
		return	(table.getText());
		
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	/***********TC3************/
	
	public void FundTransfer()
	{
		TransFun.click();
	}
	
	
	public void EnterAmount(String amount)
	{
		TransFun.sendKeys(amount);
	}
	
	public void butnClickTransfer()
	{
		btnTrans.click();	
	}
	
	
	
	
	
	
	
	
}

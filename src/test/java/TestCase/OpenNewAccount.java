package TestCase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.AccountServices;
import testBase.BaseClass;

public class OpenNewAccount extends LoginPage{
public Properties p;
	
	
	
	@Test(priority=1)
	public void AccountCreation() throws IOException
	{
FileReader file=new FileReader(".//src//test//resources//config.Properties");
		
		p=new Properties();
		p.load(file);
		
		/****TC1****/
		AccountServices AS=new AccountServices(driver);
		AS.NewAccountOpening();
		AS.ExistingAccount();
		AS.CreateAccountbtn();
		
		/****TC2****/
		AS.OverView();
	Assert.assertEquals(AS.AccountInfo(), "14010");
	
	/****TC3****/
	AS.FundTransfer();
	AS.EnterAmount(p.getProperty("Amount"));
	AS.butnClickTransfer();
	
		
	}
	

}
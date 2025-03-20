package TestCase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Registration;
import testBase.BaseClass;

public class RegistrationTestCaseUsingConfigfile extends BaseClass{

	public Properties p;
	@Test
	public void registrations() throws IOException, InterruptedException
	{
		FileReader file	=new FileReader(".//src//test//resources//config.Properties");
		p=new Properties();
		p.load(file);
		Registration rg=new Registration(driver);
		rg.registrationlink();
		Thread.sleep(5000);
	rg.firstName(p.getProperty("firstName"));
	rg.lastname(p.getProperty("lastname"));
	rg.Address(p.getProperty("Address"));
	rg.Cityname(p.getProperty("Cityname"));
	Thread.sleep(5000);
	rg.Statename(p.getProperty("Statename"));
	rg.phoneNumber(randomNumerphn().toUpperCase());
	Thread.sleep(5000);
	rg.Zipcode(RandomStringzip().toUpperCase());
	Thread.sleep(5000);
	rg.socialsecuritynumber(socialScuritynumber().toUpperCase());
	rg.UserName(p.getProperty("UserName"));
	rg.password(p.getProperty("password"));
	rg.confirmpassword(p.getProperty("confirmpassword"));
	
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
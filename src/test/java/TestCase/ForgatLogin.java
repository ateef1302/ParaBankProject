package TestCase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObject.ForgetLogin;
import testBase.BaseClass;

public class ForgatLogin extends BaseClass{

	
	public Properties p;
	
	@Test
	public void ForgotLoginDetails() throws Exception	{
		
		
		FileReader file= new FileReader(".//src//test//resources//config.Properties");
		
		p=new Properties();
		p.load(file);
		
		
		ForgetLogin fl=new ForgetLogin(driver);
		
		
		fl.loginLink();
		fl.FirstName(p.getProperty("firstName"));
		fl.LastName(p.getProperty("lastname"));
		fl.StreetAdress(p.getProperty("Address"));
		fl.State(p.getProperty("Statename"));
		fl.City(p.getProperty("Cityname"));
		fl.SSN(p.getProperty("SSN"));
		fl.Zipcode(p.getProperty("ZipC"));
		fl.btnlogininfo();
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}
}

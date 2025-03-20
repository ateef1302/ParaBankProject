package TestCase;

import static org.testng.Assert.assertEquals;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Login;
import testBase.BaseClass;

public class LoginPage extends BaseClass{
	public Properties p;
	
	
	@Test
	public void LoginDetails() throws IOException{
		
	FileReader file=new FileReader(".//src//test//resources//config.Properties");
		
		p=new Properties();
		p.load(file);
		
		Login log = new Login(driver);
		
		log.Userdetails(p.getProperty("UserName"));
		log.userPassword("Kbahhsiue");
		log.butnLogin();
	String text =log.verifyMsg();
	Assert.assertEquals(text, "The username and password could not be verified.");


		
	
	}
	
	
	
	
	
}

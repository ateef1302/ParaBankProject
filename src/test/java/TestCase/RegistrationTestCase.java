package TestCase;

import org.testng.annotations.Test;

import PageObject.Registration;
import testBase.BaseClass;

public class RegistrationTestCase extends BaseClass{

	
	@Test
	public void registrations()
	{
		Registration rg=new Registration(driver);
		rg.registrationlink();
		rg.firstName("Ateef");
		rg.lastname("Aleem");
		rg.Address("lokhandwala primises");
		rg.Cityname("Solapur");
		rg.Statename("Maharashtra");
		rg.Zipcode("413004");
		rg.socialsecuritynumber("ZALKA9982Y");
		rg.phoneNumber("8208817166");
		rg.UserName("TMOUSA");
		rg.password("MeetaData");
		rg.confirmpassword("MeetaData");
		rg.butnRegistration();
		
		
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
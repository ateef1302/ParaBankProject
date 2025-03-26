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
		rg.firstName("Ateefa");
		rg.lastname("Aleema");
		rg.Address("lokhandwala primisesa");
		rg.Cityname("Solapura");
		rg.Statename("Maharashtraa");
		rg.Zipcode("413005");
		rg.socialsecuritynumber("ZALKA9982K");
		rg.phoneNumber("8208817167");
		rg.UserName("Ateef");
		rg.password("MeetaData1");
		rg.confirmpassword("MeetaData1");
		rg.butnRegistration();
		
		
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
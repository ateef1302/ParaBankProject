package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	public Properties p;
	
	@Parameters({"os","browser"})
	@BeforeClass
	public void setup(String os,String br) throws IOException
	{
		FileReader file	=new FileReader(".//src//test//resources//config.Properties");
		p=new Properties();
		p.load(file);
	     switch(br.toLowerCase()) {
	     case "chrome" :driver=new ChromeDriver();break;
			case "edge" :driver=new EdgeDriver();break;
			case "firefox" :driver=new FirefoxDriver();break;
			default:System.out.println("invalid browser");return;
	     }
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(p.getProperty("appUrl"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	
	@AfterClass
	public void shutdown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
	
	
	public String RandomStringzip()
	{
		String zip = RandomStringUtils.randomAlphabetic(6);
		return zip;
		
		
	}
	
	public String randomNumerphn()
	{
		String phn = RandomStringUtils.randomNumeric(10);
		return phn;
		
	}
	public String socialScuritynumber()
	{
		String alpha = RandomStringUtils.randomAlphabetic(5);
		String num = RandomStringUtils.randomNumeric(5);
		return(alpha+num);
	}
	
	public String Usernumber()
	{
		String alpha = RandomStringUtils.randomAlphabetic(3);
		String num = RandomStringUtils.randomNumeric(3);
		return(alpha+num);
	}
	
	
}











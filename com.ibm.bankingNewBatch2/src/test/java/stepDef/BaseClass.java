package stepDef;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pages.LoginPage;

public class BaseClass {

	
	
	public WebDriver driver;
	public Logger log;
	public Properties prop;
	
	
	
	
	
	public LoginPage lp;
	public LoginPage addCust;
	
	
	
	public BaseClass() {
		// TODO Auto-generated constructor stub
	}
	


	//Created for generating random string for Unique email

	public static String randomestring(){

		String generatedString1 = RandomStringUtils.randomAlphabetic(7);     //asdYTTU

		return (generatedString1);

		

		

		

	}
	

}

package tests;


	
	import org.openqa.selenium.By;

	import org.testng.annotations.Test;

import pages.LoginPage1;






	public class LoginTest_Junk extends BaseTest{

	    

	    

	    @Test

	    public void verifyLoginFeature() {

	        

	        

	        LoginPage1 lp = new LoginPage1(driver);

	        lp.enterEmail(conf.getAdminUser());

	        lp.enterPass(conf.getAdminPass());

	        lp.clickLoginButton();

	        

	        

//	      driver.findElement(By.name("Email")).clear();

//	      driver.findElement(By.name("Email")).sendKeys(conf.getAdminUser());

	        

//	      driver.findElement(By.cssSelector("input#Password")).clear();

//	      driver.findElement(By.cssSelector("input#Password")).sendKeys(conf.getAdminPass());

//	      

//	      driver.findElement(By.tagName("button")).click();

	        

	    }




	
	

}

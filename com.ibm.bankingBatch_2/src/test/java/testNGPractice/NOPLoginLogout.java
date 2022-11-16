package testNGPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NOPLoginLogout extends BaseTest {
	
	 @Test

	    public void verifyLogin() throws Exception {

	        

	        driver.findElement(By.name("Email")).clear();

	        Thread.sleep(2000);

	        driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");

	        

	        driver.findElement(By.name("Password")).clear();

	        Thread.sleep(2000);

	        driver.findElement(By.name("Password")).sendKeys("admin");

	        

	        driver.findElement(By.tagName("button")).click();

	        

	    }

	    

	    

	    @Test(priority = 2)

	    public void verifyLogout() {

	        

	        driver.findElement(By.partialLinkText("Logo")).click();

	    }

	    

	    @Test(priority = 1)

	    public void verifyAppTitle() throws Exception {

	        

	        Thread.sleep(3000);

	        Assert.assertTrue(driver.getTitle().contains("Dashboard"));

	        Thread.sleep(3000);

	        

	    }

	    



}

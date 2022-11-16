package excesises;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigRead;

//import junit.framework.Assert;

public class NSPOTest_Xpath_CSS {
	
	
	@Test

	public void verifysearch() throws Exception {

		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();

		
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("https://admin-demo.nopcommerce.com/login");  
        
        Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='Email']")).clear();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@yourstore.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin");
		
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
        

        Thread.sleep(4000);

        //validation step

        String appTitle = driver.getTitle();

        System.out.println("https://admin-demo.nopcommerce.com/admin/: " + appTitle);
        
        String appURL = driver.getCurrentUrl();

        System.out.println("https://admin-demo.nopcommerce.com/admin/: " + appURL);
        
        

        //Assert.assertEquals("Amazon.in : iphone 14", appTitle);

      //  Assert.assertEquals("Amazon.in : "+searchItem, appTitle);

      //  Assert.assertTrue(appTitle.contains(searchItem));

        

        Thread.sleep(4000);

        driver.close();

	}
}
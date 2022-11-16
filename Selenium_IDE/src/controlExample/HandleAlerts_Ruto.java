package controlExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts_Ruto {
	
	
	public void ValidateAlert() throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
		
        
        driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
        Thread.sleep(3000);
        
        
        
        
		
		
		
	}

}




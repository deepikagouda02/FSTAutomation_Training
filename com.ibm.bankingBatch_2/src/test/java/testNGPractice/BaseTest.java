package testNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
public WebDriver driver;

    



    @BeforeTest

    public void launchApp() throws Exception {



        System.out.println("launch app.....");

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();



        

        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");



    }



    @AfterTest

    public void closeApp() throws Exception {



        Thread.sleep(4000);

        driver.close();

        System.out.println("closing app.....");

    }

}

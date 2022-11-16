package crossbrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigRead;
import utility.ConfigRead2;

public class BaseTest {

	   

    

	public WebDriver driver;

	    

	    //pre-condition   ------- BeforeSuite -----BeforeTest -----BeforeClass -------BeforeMethods ----- 

	    //Test

	    //post-condition  ------- AfterSuite -----AfterTest -----AfterClass -------AfterMethods ----- 

	    

	    

	    @BeforeTest

	    public void launchApp() throws Exception {

	        

	        System.out.println("launch app.....");

	        WebDriverManager.chromedriver().setup();

	        driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        ConfigRead2 conf = new ConfigRead2();

	        driver.get(conf.getAppURL());

	    }

	    @AfterTest

	    public void closeApp() throws Exception {

	        Thread.sleep(4000);

	        driver.close();

	        System.out.println("closing app.....");

	    }



	}

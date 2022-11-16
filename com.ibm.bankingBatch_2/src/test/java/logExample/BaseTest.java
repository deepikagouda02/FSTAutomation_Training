package logExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigRead2;

public class BaseTest {


    public WebDriver driver;

    ConfigRead2 conf;

    Logger log;



    @BeforeTest

    public void launchApp() throws Exception {



        

        log = Logger.getLogger("NOP Comm Login");

        PropertyConfigurator.configure(".\\testData\\log4j.properties");

        

        

        log.info("launching chrome browser.");

        

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();



        conf = new ConfigRead2();

        log.info("launching Application: " + conf.getAppURL());

        driver.get(conf.getAppURL());



    }



    @AfterTest

    public void closeApp() throws Exception {



        log.info("closing chrome browser.");

        Thread.sleep(4000);

        driver.close();

        

    }
	
	

}

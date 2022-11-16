package handleFrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigRead;

public class BaseTestTNG {

	   

    

	public WebDriver driver;
		ConfigRead conf;
	
	    

	    //pre-condition   ------- BeforeSuite -----BeforeTest -----BeforeClass -------BeforeMethods ----- 

	    //Test

	    //post-condition  ------- AfterSuite -----AfterTest -----AfterClass -------AfterMethods ----- 


	    
		//@Parameters("ibm_browser")
	    @BeforeTest

	    public void launchApp(String br) throws Exception {

	        ConfigRead conf = new ConfigRead();
	        //String br = conf.getBrowser();

	        System.out.println(" Execution on browser, fetching value from testNG.xml file:" + br);

	        WebDriverManager.chromedriver().setup();

	       WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        if(br.equalsIgnoreCase("chrome")){

	            

	            WebDriverManager.chromedriver().setup();

	            driver = new ChromeDriver();

	            

	        }

	        else if(br.equalsIgnoreCase("edge")) {

	            

	            WebDriverManager.edgedriver().setup();

	            driver = new EdgeDriver();

	        }

	        

	        else {

	            WebDriverManager.firefoxdriver().setup();

	            driver = new FirefoxDriver();
	        }




	        



	        

	        

	    }

	    

	    

	    @AfterTest

	    public void closeApp() throws Exception {

	        

	        Thread.sleep(4000);

	        driver.close();

	        System.out.println("closing app.....");

	    }



	}

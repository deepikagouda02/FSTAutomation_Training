package stepDef;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class StepDefinition extends BaseClass {

		    

		//  WebDriver driver;

		//  LoginPage lp;

		    

		    

		    @Before                             //execution before anything

		    public void setup() throws Exception {

		        

		        

		        log = Logger.getLogger("NOP Comm Login");

		        PropertyConfigurator.configure(".\\testData\\log4j.properties");

		        

		        

		        //Load Properties file

		        prop = new Properties();

		        FileInputStream fis = new FileInputStream(".\\testData\\Config.properties");

		        

		        prop.load(fis);

		        String browser = prop.getProperty("browser");//browser

		        

		        log.info("Execution on browser: " + browser);

		        

		        

		        

		        

		        if(browser.equalsIgnoreCase("chrome")) {

		            

		            WebDriverManager.chromedriver().setup();

		            driver = new ChromeDriver();

		            

		        }

		        

		        else if(browser.equalsIgnoreCase("edge")) {

		            WebDriverManager.edgedriver().setup();

		            driver = new EdgeDriver();

		            

		        }

		        

		        else {

		            

		            WebDriverManager.chromedriver().setup();

		            driver = new ChromeDriver();

		        }

		        

		    }

		    

		    

		    

		    @BeforeStep

		    public void executeBeforeEachSteps() {

		        

		        log.info("=================executeBeforeEachSteps=========================");

		    }

		    

		    

		    

		    

		    

		    

		    @Given("user launch chrome browser")

		    public void launchApp() {

		        

		        

		        

		        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		        driver.manage().window().maximize();

		        log.info("max browser");

		        

		        //Create an object - page

		        

		        lp = new LoginPage(driver);

		        

		    }



		    @When("user open app {string}")

		    public void user_open_app(String appURL) {



		        log.info("launch app : " + appURL);

		        driver.get(appURL);

		        

		    }



		    @When("user enter email as {string} and password as {string}")

		    public void user_enter_email_as_and_password_as(String email, String pwd) {

		        

		        //driver.findElement(By.cssSelector("input#Email")).sendKeys(email);

		        log.info("enter email: " + email);

		        lp.enterEmail(email);

		        log.info("enter pass: " + pwd);

		        lp.enterPass(pwd);

		    

		    }



		    @When("user click on Login")

		    public void user_click_on_Login() {

		        log.info("click on Login Button");

		        lp.clickOnLoginButton();

		        

		    }



		    @Then("page Title should be {string}")

		    public void page_Title_should_be(String appTitle) throws Exception {





		        log.info("Application Title: " + appTitle);

		        lp.verifyAppLicationTitle(appTitle);

		        

		        

		    }



		    @When("user click on Logout link")

		    public void user_click_on_Logout_link() {

		        log.info("click on Login Button");

		        lp.clickOnLogout();

		        

		    }



		    @Then("close the browser")

		    public void close_the_browser() {



		        log.info("close Application");

		        driver.close();

		        

		        

		    }



		    

		    






		
		
	}



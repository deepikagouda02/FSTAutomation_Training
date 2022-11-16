package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {



    WebDriver driver;



    public LoginPage(WebDriver driver) {



        this.driver = driver;

        PageFactory.initElements(driver, this);



    }



	    // Identification



	    @FindBy(css = "input#Email")

	    WebElement txt_Email;



	    @FindBy(how = How.CSS, using = "input#Email")

	    WebElement txt_Email1;



	    @FindBy(css = "input#Password")

	    WebElement txt_Pass;

	    

	    @FindBy(xpath = "//input[@name='RememberMe']")

	    WebElement chk_RememberMe;

	    

	    @FindBy(tagName = "button")

	    WebElement btn_Login;

	    

	    @FindBy(linkText = "Logout")

	    WebElement btn_Logout;

	    

	    // Ruto Utility

	//  @FindBy(how = How.CSS, using="input#Password")

	//  private WebElement password;

	//  

	//  

	//  

	//  public void enterOnPassword(String pass){

//	      password.clear();

//	      password.sendKeys(pass);

	//  }



	    // Methods



	    public void enterEmail(String email) {



	        txt_Email.clear();

	        txt_Email1.sendKeys(email);



	    }



	    public void enterPass(String pwd) {



	        txt_Pass.clear();

	        txt_Pass.sendKeys(pwd);



	    }



	    public void clickOnLoginButton() {



	        btn_Login.click();



	    }



	    public void clickOnCheckBoxRememberMe() {



	        chk_RememberMe.click();



	    }

	    

	    public void clickOnLogout() {



	        btn_Logout.click();



	    }

	    

	    public void verifyAppLicationTitle(String expTitle) throws Exception {

	        

	        Thread.sleep(3000);

	        Assert.assertEquals(expTitle, driver.getTitle());

	        

	    }

	
		
		
	}



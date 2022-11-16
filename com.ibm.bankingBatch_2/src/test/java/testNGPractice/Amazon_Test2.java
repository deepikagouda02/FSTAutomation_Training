package testNGPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_Test2 {
	
	  //TestNG

    //pre-condition   ----BeforeSuite -----BeforeTest ------BeforeClass -----BeforeMethod

    //Test            ---- Test

    //post-condition  ----AfterSuite -----AfterTest ------AfterClass -----AfterMethod

    

    

    //Priority

    //by default  priority - 0

    //if priority is same for test case ---- default execution workflow -----naming conv -----ascii value

    //Highest negative number - having highest priority

    

    

    

    

    

    @BeforeTest

    public void launchApp() {

        

    

        System.out.println("launching app...");

    }

    

    

    @AfterTest

    public void closingApp() {

        

        

        System.out.println("closing app...");

    }

    

    @Test(priority = 0)

    public void login() {

        

        

        System.out.println("login testcase ...");

    }

    

    @Test(priority = 3)

    public void logout() {

        

        

        System.out.println("logout testcase ...");

    }

    

    

    @Test(priority = 1)

    public void addItem() {

        

        

        System.out.println("addItem testcase ...");

    }

    

    

    @Test(priority = 2)

    public void payment() {

        

        

        System.out.println("payment testcase ...");

    }



}

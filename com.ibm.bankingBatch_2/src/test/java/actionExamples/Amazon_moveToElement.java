package actionExamples;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Amazon_moveToElement {



    public WebDriver driver;



    @BeforeTest

    public void launchApp() throws Exception {



        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        
        

        

        driver.get("https://www.amazon.in/stores/page/4F1CFFDA-292D-4D74-B9FA-53C8A5778F28/?_encoding=UTF8&store_ref=SB_A049595540QB085EDZ6K&pd_rd_plhdr=t&aaxitk=9447c1b10323a5511756cea3a359e48b&hsa_cr_id=9409154380702&lp_asins=B0BDJVSDMY%2CB0BDJ213TX%2CB0BDJ6N5D6&lp_query=iphone%2014&lp_slot=auto-sparkle-hsa-tetris&ref_=sbx_be_s_sparkle_mcd_bkgd&pd_rd_w=Hhk0q&content-id=amzn1.sym.9cd3c74c-b132-4f5d-9fa4-b077d9aff68d%3Aamzn1.sym.9cd3c74c-b132-4f5d-9fa4-b077d9aff68d&pf_rd_p=9cd3c74c-b132-4f5d-9fa4-b077d9aff68d&pf_rd_r=S2BEREVNMFRJC836CMHB&pd_rd_wg=HD6ql&pd_rd_r=3a183537-573d-48f0-a693-4a5ffffe7d01");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);



    }



    @AfterTest

    public void closeApp() throws Exception {



        Thread.sleep(4000);

        driver.close();

        System.out.println("closing app.....");

    }



    @Test(enabled = true)

    public void perfomClickOperation() throws Exception {



        

        //inside frame

        //handle frame

        WebElement signIn = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));


        WebElement wishList = driver.findElement(By.xpath("//span[contains(text(),'Create a Wish List')]"));
        

        



      //  driver.switchTo().frame(photoFrame);

        Actions act = new Actions(driver);
        Thread.sleep(3000);
      act.moveToElement(signIn).moveToElement(wishList).click().perform();

     // act.moveToElement(signIn).click(wishList).perform();


        

        System.out.println("--------------------------------------------");

        



        //Method 2

        //A convenience method that performs click-and-hold at the location of the source element, 

        //moves to the location of the target element, then releases the mouse.

        

        //act.clickAndHold(img4).moveToElement(trash).release().perform();

        

        

    }

    

}

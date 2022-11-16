package controlExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class HandleCheckboxRadioButton extends BaseTest {
	
	/*@Before
	public void launchApp() {
		
		System.out.println("launch App....");
	}
	
	@After
	public void closeApp() {
		
		System.out.println("Closing App....");
	}
	
	
	
	@Test
	public void handleCheckbox() {
		
		System.out.println("Test Case1....");
		
		
		
	}
	*/
	
    @Test

    public void handleCheckbox() throws Exception {


        Thread.sleep(4000);

        driver.findElement(By.xpath("//input[@value=\"Car\"]")).click();

        

        driver.findElement(By.xpath("//input[@value='Bike']")).click();

        System.out.println("test case1");

        

        

        

    }

    

    

    



}


	



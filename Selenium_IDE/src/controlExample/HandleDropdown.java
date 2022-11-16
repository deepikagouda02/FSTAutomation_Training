package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleDropdown extends BaseTest {
	
	   

    //@Test

    public void verifyDropdownMult() throws Exception {

        

        

        Thread.sleep(4000);

        WebElement list = driver.findElement(By.cssSelector("[name='FromLB']"));

        

        

        //create an object of Select calss

        

        Select sel = new Select(list);

        

        System.out.println("is listbox accept multiple selection or not: " + sel.isMultiple());

        Assert.assertTrue(sel.isMultiple());

        

        //selection 

        //indexing start from 0

        Thread.sleep(4000);

        sel.selectByIndex(0);                   //USA

        Thread.sleep(1000);

        sel.selectByIndex(1);                   //Russia

        sel.selectByValue("India");             //India

        sel.selectByVisibleText("Germany");

        

        Thread.sleep(4000);

        

        sel.deselectByValue("Russia");

        sel.deselectByVisibleText("Germany");

        Thread.sleep(2000);

        sel.deselectAll();

        

        Thread.sleep(4000);

        sel.selectByValue("India");             //India

        sel.selectByVisibleText("Germany");

        

    }

    



    

    @Test

    public void verifyDropdownSingle() throws Exception {

        

        

        Thread.sleep(4000);

        WebElement list = driver.findElement(By.tagName("select"));

        

        

        //create an object of Select calss

        

        Select sel = new Select(list);

        

        System.out.println("is listbox accept multiple selection or not: " + sel.isMultiple());

        Assert.assertFalse(sel.isMultiple());

        

        //selection 

        //indexing start from 0

        Thread.sleep(4000);

        

        sel.selectByIndex(1);                   //Saab

        Thread.sleep(2000);

        sel.selectByValue("USA");               //VOlvo

        Thread.sleep(2000);

        sel.selectByVisibleText("Toyota");      //Toyota

        

        Thread.sleep(4000);

        

        

        

    }

    

    

}
	



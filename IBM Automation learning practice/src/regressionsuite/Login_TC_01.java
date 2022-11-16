package regressionsuite;

import org.testng.annotations.Test;

import configExample.ReadDataConfig;

public class Login_TC_01 extends BaseTest {
	
	@Test
	public void verifyLogin() throws Exception {
		
		//System.out.println("Login test case");
		
		//ReadDataConfig conf = new ReadDataConfig();
		System.out.println("Application URL :" + conf.getAppURL_QA());
		
		
		System.out.println(conf.getUserName());
	}

}

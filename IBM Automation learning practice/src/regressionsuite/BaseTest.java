package regressionsuite;

import org.testng.annotations.BeforeTest;

import configExample.ReadDataConfig;

public class BaseTest {
	
	ReadDataConfig conf;
	
	@BeforeTest
	public void pre_condition() throws Exception {

			
			//System.out.println("Login test case");
			
			ReadDataConfig conf = new ReadDataConfig();
			//System.out.println("Application URL :" + conf.getAppURL_QA());
		
	
	}
}

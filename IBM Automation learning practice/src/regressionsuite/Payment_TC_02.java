package regressionsuite;

import org.testng.annotations.Test;

import configExample.ReadDataConfig;

public class Payment_TC_02 {
	
	@Test
	public void verifyLogin() throws Exception {
		
		ReadDataConfig conf = new ReadDataConfig();
		System.out.println("Application URL :" +conf.getAppURL_QA());
		
		
		System.out.println(conf.getUserName());
	}
	
	

}

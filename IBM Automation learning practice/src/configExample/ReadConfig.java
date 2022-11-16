package configExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// FileInputStream fis = new FileInputStream("./testData\\config.properties");
		 
		 FileInputStream fis = new FileInputStream("c:/Users/Student/eclipse-workspace/IBM Automation learning practice/Test Data/config.properties");
		 
		 Properties prop = new Properties();
	        prop.load(fis);
	        
	        System.out.println("Application URL: " + prop.getProperty("url"));
	        System.out.println("Application URL: " + prop.getProperty("url_qa"));
	        System.out.println("Application URL: " + prop.getProperty("url_dev"));
	        System.out.println(prop.getProperty("username"));
	        System.out.println(prop.getProperty("password"));
		

	}

}

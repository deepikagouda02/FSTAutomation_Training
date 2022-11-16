
package utility;

import java.io.FileInputStream;

import java.util.Properties;

public class ConfigRead2 {

	Properties prop;

	public ConfigRead2() throws Exception {

		FileInputStream fis = new FileInputStream("./testData/config.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String getAppURL() {

		return prop.getProperty("app_url_QA");
	}

	public String getSampleAppURL() {

		return prop.getProperty("app_url_QA");

	}

	public String getBrowser() {

		return prop.getProperty("browser");

	}

	public String getAdminUser() {

		return prop.getProperty("adminUserName");

	}

	public String getAdminPass() {

		return prop.getProperty("adminPassword");

	}

}
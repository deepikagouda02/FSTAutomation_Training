package configExample;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataConfig {
    Properties prop;
    public ReadDataConfig() throws Exception {
        FileInputStream fis = new FileInputStream("./testData\\config.properties");
        prop = new Properties();
        prop.load(fis);
    }

    public String getAppURL() {



        return prop.getProperty("url");



    }

    

    public String getAppURL_QA() {



        return prop.getProperty("url_qa");



    }

    

    public String getAppURL_DEV() {



        return prop.getProperty("url_dev");



    }

    

    public String getUserName() {

        return prop.getProperty("username");

        

    }



}
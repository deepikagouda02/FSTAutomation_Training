package testRun;


import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;









@RunWith(Cucumber.class)

@CucumberOptions(

        

                    
        			//features = ".\\Feature\\login.feature",
                    //features = ".\\Feature\\loginNOPTesting.feature",
					features = ".\\Feature\\Customers1.feature",

                    glue = "stepDef",

                    monochrome = true,


                            dryRun = true,

                            plugin = {"pretty", "html: test-output"},
                    //tags = {"@ibm_regression"},

                                    tags = {"@sanity"}      

        

                )











public class TestRunner {



}



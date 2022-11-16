package program;

public class Assert {

		    
		    String actualValue = "Google - iphone"; //fetch from application
		   boolean actualValue_bool = true;
		   int actualValue_int = 123;
		    
		    public void assertEqual(String expectedValue) {
		        
		        
		        if(actualValue.equalsIgnoreCase(expectedValue)) {
		            
		            System.out.println("validation step .....pass !!");
		        }
		        
		        else {
		            
		            System.out.println("validation step .....fail !!");
		        }
		        
		        
		    }
		    
		    
		   
		    
		    public void assertEqual(String expectedValue, String errorMessage) {
		        
		        
		        if(actualValue.equalsIgnoreCase(expectedValue)) {
		            
		            System.out.println("validation step .....pass !!");
		        }
		        
		        else {
		            
		            System.out.println("validation step .....fail !!");
		        }
		        
		        
		    }
		    

		    public void assertEqual(boolean expectedValue) {
		        
		        
		        if(actualValue_bool == expectedValue) {
		            
		            System.out.println("validation step .....pass !!");
		        }
		        
		        else {
		            
		            System.out.println("validation step .....fail !!");
		        }
		        
		        
		    }
		    
		    public void assertEqual(int expectedValue) {
		        
		        
		        if(actualValue_int == expectedValue) {
		            
		            System.out.println("validation step .....pass !!");
		        }
		        
		        else {
		            
		            System.out.println("validation step .....fail !!");
		        }
		        
		        
		    }
		    
		    


		}

		    
		    	



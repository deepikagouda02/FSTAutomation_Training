package exercise;

import org.junit.Test;

public class TestExample {
	
	@Test
	public void featureTest() {
		
		//BasicFeatures
		//BMWCar 	
		
		BasicFeature basic = new BasicFeature();
		basic.startCar();
		basic.stopCar();
		
		
		System.out.println("=======================================");
		BMWCar bmw = new BMWCar();
		bmw.ADASFeature();
		bmw.startCar();
		bmw.stopCar();
		
		

	}
	
	
	

}

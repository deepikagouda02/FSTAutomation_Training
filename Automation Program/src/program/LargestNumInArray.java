package program;

import java.util.ArrayList;

public class LargestNumInArray {
	private static final int ArrayList = 0;
	private static final int Integer = 0;

	public static void main(String[] args) {  

		

        int arr[] = new int [] {1,4,7,3,6}; 
        
		//public static int getHighScore(ArrayList<Integer> scoreBoard)
		{ 
		
	        //Initialize array  

	        //int arr[] = new int [] {1,4,7,3,6};  

	        //Initialize max with first element of array.  

	        int max = arr[0];  

	        //Loop through the array  

	        for (int i = 0; i < arr.length; i++) {  

	            //Compare elements of array with max  

	           if(arr[i] > max)  

	               max = arr[i];  

	        }  

	        System.out.println("Largest element present in given array: " + max);  
		}
	    

	}  
}
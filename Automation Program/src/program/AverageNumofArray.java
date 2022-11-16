package program;

import java.util.ArrayList;

public class AverageNumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Input: [1,4,7,3,6]
		/*
        int arr[] = new int [] {1,4,7,3,6};
        int sum = 0, avg;      
        ArrayList<Integer> list = new ArrayList<Integer>();*/    
		//public static int average(ArrayList<Integer> scoreBoard) {


//public static void main(String args[])   
		
		{  
		
		int sum = 0, avg;      
		
		ArrayList<Integer> list = new ArrayList<Integer>();    
		
		//adding elements to the List  
		
		list.add(1);  
		
		list.add(4);  
		
		list.add(7);  
		
		list.add(3);  
		
		list.add(6);  
		
		//loop iterates over the List  
		
		for(int i = 0; i < list.size(); i++)  
		
		//getting elements from the list and adding to the variable sum   
		
		sum = sum + list.get(i);  
		
		//finds the average of the list  
		
		avg = sum / list.size();   
		
		//prints the result  
		
		System.out.println("The average of the List: " + avg);  
		
		}  
					}
			}
		


package program;

import java.util.*;  

public class Test  
{  

public static void main(String args[])  

{  
//creates an array   

//the asList() method return a fixed-size list backed by the specified array  
	public static int average(ArrayList<Integer> scoreBoard)
	{
	List<Integer> list = Arrays.asList(1,4,7,3,6);  

	IntSummaryStatistics iss = list.stream().mapToInt((a) -> a). summaryStatistics();  

	System.out.println("The average of the List is: "+iss.getAverage());  

}  

}  
}
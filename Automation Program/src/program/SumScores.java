package program;

import java.util.ArrayList;

public class SumScores {

		
	public static int sumScores(ArrayList<Integer> scoreBoard)
	//public static int sumScores()	
	{
		int arr[] = {1,4,7,3,6};
		int Sum = 0;
		int i;
		// TODO Auto-generated method stub
		for(i=0;i<arr.length;i++)
			Sum += arr[i];
			return Sum;		
	}

public static void main(String[] args) {
	
	//System.out.println("sum of given array is " + sumScores());
	System.out.println("sum of given array is " + sumScores(null));
	
}

}

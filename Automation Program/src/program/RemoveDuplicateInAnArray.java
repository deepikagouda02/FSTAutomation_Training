package program;

import java.util.ArrayList;

public class RemoveDuplicateInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


	ArrayList<String> lst = new ArrayList<String>();
	
	lst.add("ABC");
	
	lst.add("ABC");
	
	lst.add("ABCD");
	
	lst.add("ABCD");
	
	lst.add("ABCE");
	
	
	
	System.out.println("Duplicates List "+lst);
	
	
	
	Object[] st = lst.toArray();
	
	for (Object s : st) {
	
	    if (lst.indexOf(s) != lst.lastIndexOf(s)) {
	
	        lst.remove(lst.lastIndexOf(s));
	
	    }
	
	}
	
	System.out.println("Distinct List "+lst);
	
		}
	
	}

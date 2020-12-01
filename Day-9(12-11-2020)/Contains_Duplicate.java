package day_6;

import java.util.HashSet;
import java.util.Scanner;

public class Contains_Duplicate {

	private static final int[] nums = null;
	public static boolean containsDuplicate(int[] nums) {
	    if(nums==null || nums.length==0)
	        return false;
	 
	    HashSet<Integer> set = new HashSet<Integer>();
	    for(int i: nums){
	        if(!set.add(i)){
	            return true;
	        }
	    }
	 
	    return false;
	}
public static void main(String[] args) {
 
	 Scanner sc = new Scanner(System.in);
	 sc.nextLine();	
	 containsDuplicate(nums);
}
}

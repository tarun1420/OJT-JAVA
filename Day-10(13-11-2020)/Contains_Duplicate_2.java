package day_6;

import java.util.HashMap;

public class Contains_Duplicate_2 {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	 
	    for(int i=0; i<nums.length; i++){
	        if(map.containsKey(nums[i])){
	            int pre = map.get(nums[i]);
	            if(i-pre<=k)
	                return true;
	        }
	 
	        map.put(nums[i], i);
	    }
	 
	    return false;
	}
public static void main(String[] args) {

	System.out.println();
}
}

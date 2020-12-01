package day_11;

import java.util.Scanner;

public class Range {
	public static int[] searchRange(int[] nums, int target) {
	    int l=0;
	    int r=nums.length-1;
	 
	    while(l<r){
	        int m=l+(r-l)/2;
	        if(nums[m]<target){
	            l=m+1;
	        }else{
	            r=m;
	        }
	    }
	 
	    int first=l;
	    if(l<nums.length&&nums[l]==target){
	        l=0;
	        r=nums.length-1;
	        while(l<r){
	            int m=l+(r-l+1)/2;
	            if(nums[m]>target){
	                r=m-1;
	            }else{
	                l=m;
	            }
	        }
	        return new int[]{first, r};
	    }
	    return new int[]{-1,-1};
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	     System.out.println("Enter the length of array");
	     int length = s.nextInt();
	     int [] myArray = new int[length];
	     System.out.println("Enter the elements of array");
	     for(int i=0; i<length; i++ ) {
	        myArray[i] = s.nextInt();
	     }
	     System.out.println("Enter the target");
	     int t = s.nextInt();
	     searchRange(myArray,t);
	}

}
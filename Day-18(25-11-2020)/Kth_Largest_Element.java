package day_11;

import java.util.Arrays;
import java.util.Scanner;

public class Kth_Largest_Element {
	public static int findKthLargest(int[] nums, int k) {
	    Arrays.sort(nums);
	    return nums[nums.length-k];
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
	     findKthLargest(myArray,t);

	}

}
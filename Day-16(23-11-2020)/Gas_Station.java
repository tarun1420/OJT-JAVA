package day_10;

import java.util.Scanner;

public class Gas_Station {

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int sumRemaining = 0; // track current remaining
		int total = 0; // track total remaining
		int start = 0; 
	 
		for (int i = 0; i < gas.length; i++) {
			int remaining = gas[i] - cost[i];
	 
			//if sum remaining of (i-1) >= 0, continue 
			if (sumRemaining >= 0) { 
				sumRemaining += remaining;
			//otherwise, reset start index to be current
			} else {
				sumRemaining = remaining;
				start = i;
			}
			total += remaining;
		}
	 
		if (total >= 0){
			return start;
		}else{
			return -1;
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int arr1[] = {5,4,3,2,1};
		
		   int start =canCompleteCircuit(arr, arr1); 
	          
	        System.out.println(start == -1 ? "No Solution" : "Start = " + start);  

	}
}

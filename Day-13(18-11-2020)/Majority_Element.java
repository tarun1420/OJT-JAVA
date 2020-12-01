package day_8;

import java.util.Arrays;

public class Majority_Element {

	public static int majorityElement(int[] num) {
		if (num.length == 1) {
			return num[0];
		}
	 //Import arrays
		Arrays.sort(num);
		return num[num.length / 2];
	}
	//Driver code
public static void main(String[] args) {
	  int arr[] = { 1, 1, 2, 1, 3, 5, 1 }; 
      int n = arr.length; 
      System.out.println("Majority Element is "+majorityElement(arr)); 
}
}

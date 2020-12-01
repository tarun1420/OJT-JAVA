package day_8;

public class Minimum_In_Rotated_Sorted_Array_2 {

	public static int findMin(int[] nums) {
	    int i=0;
	    int j=nums.length-1;
	 
	    while(i<=j){
	 
	        //handle cases like [3, 1, 3]
	        while(nums[i]==nums[j] && i!=j){
	            i++;
	        }
	 
	        if(nums[i]<=nums[j]){
	            return nums[i];
	        }
	 
	        int m=(i+j)/2;
	        if(nums[m]>=nums[i]){
	            i=m+1;
	        }else{
	            j=m;
	        }
	    }
	 
	    return -1;
	}
public static void main(String[] args) {

	int arr[] = {2,6,8,3};
	int n = arr.length;
	System.out.println("The minium element is "+findMin(arr));
}
}

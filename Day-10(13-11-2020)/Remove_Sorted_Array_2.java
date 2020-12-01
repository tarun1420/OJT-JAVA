package day_6;

public class Remove_Sorted_Array_2 {
	  private static int removeDuplicates(int[] nums) {
		    int n = nums.length;

		    int j = 0;

		    for (int i = 0; i < n; i++) {
		    
		      if (i < n - 2 && nums[i] == nums[i + 2]) {
		        continue;
		      }

		      nums[j++] = nums[i];
		    }

		    return j;
		  }

		  public static void main(String[] args) {
		    int[] nums = new int[] { 1, 1, 1, 3, 5, 5, 7 };
		    int newLength = removeDuplicates(nums);

		    System.out.println("Length of array after removing duplicates = " + newLength);

		    System.out.print("Array = ");
		    for (int i = 0; i < newLength; i++) {
		      System.out.print(nums[i] + " ");
		    }
		    System.out.println();
		  }
		}
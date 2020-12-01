package day_10;

public class Container_With_Water {

	public static int maxArea(int[] height) {
		if (height == null || height.length < 2) {
			return 0;
		}
	 
		int max = 0;
		int left = 0;
		int right = height.length - 1;
	 
		while (left < right) {
			max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
			if (height[left] < height[right])
				left++;
			else
				right--;
		}
	 
		return max;
	}
	  public static void main(String[] args) 
	    { 
	        int a[] = {1,2,3,4,5}; 
      
	        int len = 1; 
	        System.out.print( maxArea(a)+"\n" ); 
}
}
package day_11;

import java.util.Scanner;

public class First_Missing_Positive {
	public static int firstMissingPositive(int[] A) {
        int n = A.length;
 
    	for (int i = 0; i < n; i++) {
    		while (A[i] != i + 1) {
    			if (A[i] <= 0 || A[i] >= n)
    				break;
 
                	if(A[i]==A[A[i]-1])
                    		break;
 
    			int temp = A[i];
    			A[i] = A[temp - 1];
    			A[temp - 1] = temp;
    		}
    	}
 
    	for (int i = 0; i < n; i++){
    		if (A[i] != i + 1){
    			return i + 1;
    		}
    	}	
    	return n + 1;
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
          firstMissingPositive(myArray);
	}

}
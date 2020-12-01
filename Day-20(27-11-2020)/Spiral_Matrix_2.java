package day_12;

import java.util.Scanner;

public class Spiral_Matrix_2 {

	public static int[][] generateMatrix(int n) {
	    int[][] result = new int[n][n];
	 
	    int k=1; 
	    int top=0;
	    int bottom=n-1;
	    int left=0;
	    int right=n-1;
	 
	    while(k<=n*n){
	        for(int i=left; i<=right; i++){
	            result[top][i]=k;
	            k++;
	        }    
	        top++;
	 
	        for(int i=top; i<=bottom; i++){
	            result[i][right]=k;
	            k++;
	        }
	        right--;
	 
	        for(int i=right; i>=left; i--){
	            result[bottom][i]=k;
	            k++;
	        }
	        bottom--;
	 
	        for(int i=bottom; i>=top; i--){
	            result[i][left] = k;
	            k++;
	        }
	        left++;
	    }
	 
	    return result;
	}
	//Driver Code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 // on some other input
	      int[][] a = { {1,2,3,4},
	                  {5,6,7,8},
	                  {9,10,11,12}};
	      System.out.println(generateMatrix(a)); 
	}
}

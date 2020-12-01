package day_6; 
  
public class Triangle 
{ 
    static int A[][] = {{2},  
                        {3, 9},  
                        {1, 6, 7}}; 
                          
    // Util function to find  
    // minimum sum for a path 
    static int minSumPath() 
    { 
        // For storing the result 
        // in a 1-D array, and  
        // simultaneously updating  
        // the result. 
        int []memo = new int[A.length]; 
        int n = A.length - 1; 
      
        // For the bottom row 
        for (int i = 0;  
                 i < A[n].length; i++)  
            memo[i] = A[n][i]; 
      
        // Calculation of the  
        // remaining rows, in 
        // bottom up manner. 
        for (int i = A.length - 2;  
                 i >= 0; i--)  
            for (int j = 0;  
                     j < A[i].length; j++)  
                memo[j] = A[i][j] +  
                          (int)Math.min(memo[j],  
                                   memo[j + 1]); 
      
        // return the top element 
        return memo[0]; 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        System.out.print(minSumPath()); 
    } 
} 
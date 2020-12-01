package day_12;

import java.util.ArrayList;

public class Spiral_Matrix {
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0) 
            return new ArrayList<Integer>();
 
        return spiralOrder(matrix,0,0,matrix.length,matrix[0].length);
    }
 
 
    public static ArrayList<Integer> spiralOrder(int [][] matrix, int x, int y, int m, int n){
        ArrayList<Integer> result = new ArrayList<Integer>();
 
        if(m<=0||n<=0) 
            return result;
 
        //only one element left
        if(m==1&&n==1) {
            result.add(matrix[x][y]);
            return result;
        }
 
        //top - move right
        for(int i=0;i<n-1;i++){
            result.add(matrix[x][y++]);
        }
 
        //right - move down
        for(int i=0;i<m-1;i++){
            result.add(matrix[x++][y]);
        }
 
        //bottom - move left
        if(m>1){    
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y--]);
            }
        }
 
        //left - move up
        if(n>1){
            for(int i=0;i<m-1;i++){
                result.add(matrix[x--][y]);
            }
        }
 
        if(m==1||n==1)
            result.addAll(spiralOrder(matrix, x, y, 1, 1));
        else    
            result.addAll(spiralOrder(matrix, x+1, y+1, m-2, n-2));
 
        return result;
    }
    public static void main(String[] args) 
    { 
      // Driver code
      // Change the following array to test 
      // on some other input
      int a[][] = { {1,2,3,4},
                  {5,6,7,8},
                  {9,10,11,12}};
      System.out.println(spiralOrder(a)); 
    } 
  }
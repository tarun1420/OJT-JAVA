package com;

public class Merge_Sorted_Array {
	//Merging the Arrays
       public void merge(int A[], int x, int B[], int y) {
           while(x > 0 && y > 0){
            if(A[x-1] > B[y-1]){
               A[x+y-1] = A[x-1];
                 x--;
           }else{
               A[x+y-1] = B[y-1];
                 y--;
           }
           }
           while(y > 0){
               A[x+y-1] = B[y-1];
                 y--;
           }
           }
           }
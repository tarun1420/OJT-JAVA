package com;

public class Search_Insert_Position {
    public int searchInsert(int[] A, int target) {
        // if the array is empty, just insert target into index 0
        if (A.length == 0) return 0;
        
        // iterate the array until the end
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= target) return i;
        }
        
        // insert at the end
        return A.length;
    }
}
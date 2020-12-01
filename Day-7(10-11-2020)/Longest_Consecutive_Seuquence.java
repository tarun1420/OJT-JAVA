package day_5;

import java.util.*;
 
public class Longest_Consecutive_Seuquence {
 
    static int findLongestConseqSubseq(int arr[],int n)
    {
 
        // Sort the array
        Arrays.sort(arr);
 
        int ans = 0, count = 0;
       
        ArrayList<Integer> v = new ArrayList<Integer>();
        v.add(10);
       
        // Insert repeated elements 
        for (int i = 1; i < n; i++) 
        {
            if (arr[i] != arr[i - 1])
                v.add(arr[i]);
        }
    
        // Find the maximum length
        for (int i = 0; i < v.size(); i++) 
        {

            if (i > 0 &&v.get(i) == v.get(i - 1) + 1)
                count++;
            else
                count = 1;
 
            // Update the maximum
            ans = Math.max(ans, count);
        }
        return ans;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3 };
        int n = arr.length;
 
        System.out.println(
            "Length of the Longest subsequence is "
            + findLongestConseqSubseq(arr, n));
    }
}
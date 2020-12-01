package com;
// Importing the packages
import java.util.HashSet;
import java.util.Set;

public class Two_Sum_3 {

Set<Integer> nums = new HashSet<>();
Set<Integer> res = new HashSet<>();
// Initialize your data structure here
public Two_Sum_3() {

}

// Add the number to an internal data structure
public void add(int number) {

    for( Integer s : nums)
    {
       res.add(s+number) ;
    }

    nums.add(number);
}

// Find if there exists any pair of numbers which sum is equal to the value.
public boolean find(int value) {

     if(res.contains(value))
           return true;
     else
        return false;
    }
public static void main(String[] args) {
}
}

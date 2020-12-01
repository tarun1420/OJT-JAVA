package com;
//Given  an array of n positive integers and a positive integer s,
public class Minimum_Sub_Array_Sum {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int left = 0;
        int sum = 0;
        int rst = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= s) {
                rst = Math.min(rst, right - left + 1);
                sum -= nums[left++];
            }
        }
//MAX_VALUE to return the maximum value
        return rst == Integer.MAX_VALUE ? 0 : rst;
    }
}
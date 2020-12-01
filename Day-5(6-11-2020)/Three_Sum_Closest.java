package com;

import java.util.Arrays;

public class Three_Sum_Closest {
    // Give an array numbers of n integer
     
    public int threeSumClosest(int[] numbers, int target) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
//sort arrays
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 2; i++) {
            int left = i + 1;
            int right = numbers.length - 1;

            while (left < right) {
                int s = numbers[i] + numbers[left] + numbers[right];
                if (Math.abs(s - target) < min) {
                    min = Math.abs(s - target);
                    sum = s;
                }

                if (s < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        //@return : return the sum of the three integers, the sum closest target.
        return sum;
    }
}
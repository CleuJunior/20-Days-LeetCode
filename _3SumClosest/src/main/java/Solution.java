package main.java;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int aPointer = i+1;
            int bPointer = nums.length-1;

            while(aPointer < bPointer) {
                int currentSum = nums[i] + nums[aPointer] + nums[bPointer];

                if(currentSum > target) {
                    bPointer -= 1;

                } else {
                    aPointer += 1;
                }

                if(Math.abs(currentSum-target) < Math.abs(result-target)) {
                    result = currentSum;
                }
            }
        }

        return result;
    }
}

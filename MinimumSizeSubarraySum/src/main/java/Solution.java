package main.java;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;

        int left = 0;
        int valSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            valSum += currentNumber;

            while(valSum >= target) {
                result = Math.min(result, i - left + 1);
                valSum -= nums[left];
                left++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}

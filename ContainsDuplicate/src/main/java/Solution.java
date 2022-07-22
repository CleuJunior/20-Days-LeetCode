package main.java;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        java.util.Arrays.sort(nums);

        int numCompare = Integer.MIN_VALUE ;

        for (int num: nums) {
            if(numCompare == num)
                return true;

            numCompare = num;
        }

        return false;
    }
}

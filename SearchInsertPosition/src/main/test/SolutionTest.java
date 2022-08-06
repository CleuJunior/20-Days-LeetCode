package main.test;

import main.java.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void exampleTest01() {
        final int[] nums  = {1,3,5,6};
        final int target = 5;

        final int expected = 2;
        final int actual = solution.searchInsert(nums, target);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void exampleTest02() {
        final int[] nums  = {1,3,5,6};
        final int target = 2;

        final int expected = 1;
        final int actual = solution.searchInsert(nums, target);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void exampleTest03() {
        final int[] nums  = {1,3,5,6};
        final int target = 7;

        final int expected = 4;
        final int actual = solution.searchInsert(nums, target);

        Assert.assertEquals(expected, actual);
    }


}
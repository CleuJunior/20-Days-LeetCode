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
        final int target = 7;
        final int[] nums = new int[]{2,3,1,2,4,3};

        final int expected = 2;
        final int actual = solution.minSubArrayLen(target, nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exampleTest02() {
        final int target = 4;
        final int[] nums = new int[]{1,4,4};

        final int expected = 1;
        final int actual = solution.minSubArrayLen(target, nums);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exampleTest03() {
        final int target = 11;
        final int[] nums = new int[]{1,1,1,1,1,1,1,1};

        final int expected = 0;
        final int actual = solution.minSubArrayLen(target, nums);

        Assert.assertEquals(expected, actual);
    }
}
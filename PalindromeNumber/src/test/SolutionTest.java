package test;

import main.Solution;
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
        Assert.assertTrue(solution.isPalindrome(121));
    }

    @Test
    public void exampleTest02() {
        Assert.assertFalse(solution.isPalindrome(-121));
    }

    @Test
    public void exampleTest03() {
        Assert.assertFalse(solution.isPalindrome(10));
    }

    @Test
    public void oneTwoThreeShouldReturnFalse() {
        Assert.assertFalse(solution.isPalindrome(123));
    }

    @Test
    public void oneZeroZeroOneShouldReturnTrue() {
        Assert.assertTrue(solution.isPalindrome(1001));
    }

    @Test
    public void oneOneZeroZeroShouldReturnFalse() {
        Assert.assertFalse(solution.isPalindrome(1100));
    }
}
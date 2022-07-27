package test;

import main.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        this.solution = new Solution();
    }

    @Test
    public void exampleTest01() {
        boolean isTrue = solution.isPalindrome("A man, a plan, a canal: Panama");

        Assert.assertTrue(isTrue);
    }

    @Test
    public void exampleTest02() {
        boolean isFalse = solution.isPalindrome("race a car");

        Assert.assertFalse(isFalse);
    }

    @Test
    public void exampleTest03() {
        boolean isTrue = solution.isPalindrome(" ");

        Assert.assertTrue(isTrue);
    }
}

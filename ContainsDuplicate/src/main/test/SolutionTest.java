package main.test;


import main.java.Solution;
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
        int[] numForTest = {1, 2, 3, 1};
        boolean isTrue = solution.containsDuplicate(numForTest);
        final String MESSAGE = "[1, 2, 3, 1] - Should return TRUE but return FALSE";

        Assert.assertTrue(MESSAGE,isTrue);
    }

    @Test
    public void exampleTest02() {
        int[] numForTest = {1,2,3,4};
        boolean isFalse = solution.containsDuplicate(numForTest);
        final String MESSAGE = "[1, 2, 3, 4] - Should return FALSE but return TRUE";

        Assert.assertFalse(MESSAGE,isFalse);
    }

    @Test
    public void exampleTest03() {
        int[] numForTest = {1,1,1,3,3,4,3,2,4,2};
        boolean isTrue = solution.containsDuplicate(numForTest);
        final String MESSAGE = "[1, 1, 1, 3, 3, 4, 3, 2, 4, 2] - Should return TRUE but return FALSE";

        Assert.assertTrue(MESSAGE, isTrue);
    }
}
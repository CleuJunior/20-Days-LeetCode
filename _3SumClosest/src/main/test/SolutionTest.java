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
        int expected = 2;
        int actual = solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exampleTest02() {
        int expected = 0;
        int actual = solution.threeSumClosest(new int[]{0, 0, 0}, 1);

        Assert.assertEquals(expected, actual);
    }
}
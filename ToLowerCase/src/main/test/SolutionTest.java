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
        final String expected = "hello";
        final String result = solution.toLowerCase("Hello");

        Assert.assertEquals(expected, result);
    }

    @Test
    public void exampleTest02() {
        final String expected = "here";
        final String result = solution.toLowerCase("here");

        Assert.assertEquals(expected, result);
    }

    @Test
    public void exampleTest03() {
        final String expected = "lovely";
        final String result = solution.toLowerCase("LOVELY");

        Assert.assertEquals(expected, result);
    }
}

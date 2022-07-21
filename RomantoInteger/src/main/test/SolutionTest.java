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
        int expected = 3;
        int actual = solution.romanToInt("III");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exampleTest02() {
        int expected = 58;
        int actual = solution.romanToInt("LVIII");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exampleTest03() {
        int expected = 1994;
        int actual = solution.romanToInt("MCMXCIV");

        Assert.assertEquals(expected, actual);
    }
}
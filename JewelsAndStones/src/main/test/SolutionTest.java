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
        final String jewels = "aA";
        final String stones  = "aAAbbbb";

        final int expected = 3;
        final int actual = solution.numJewelsInStones(jewels, stones);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void exampleTest02() {
        final String jewels = "z";
        final String stones  = "ZZ";

        final int expected = 0;
        final int actual = solution.numJewelsInStones(jewels, stones);

        Assert.assertEquals(expected, actual);
    }
}

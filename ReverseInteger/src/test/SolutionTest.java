package test;


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
        int expected = 321;
        int actual = solution.reverse(123);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exampleTest02() {
        int expected = -321;
        int actual = solution.reverse(-123);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exampleTest03() {
        int expected = 21;
        int actual = solution.reverse(120);

        Assert.assertEquals(expected, actual);
    }
}
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
        final int[] array01 = new int[]{1,3,1};
        final int[] array02 = new int[]{1,5,1};
        final int[] array03 = new int[]{4,2,1};

        final int expected = 7;
        final int actual = solution.minPathSum(new int[][]{array01, array02, array03});

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exampleTest02() {
        final int[] array01 = new int[]{1,2,3};
        final int[] array02 = new int[]{4,5,6};

        final int expected = 12;
        final int actual = solution.minPathSum(new int[][]{array01, array02});

        Assert.assertEquals(expected, actual);
    }
}
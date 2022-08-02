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
        final String[] words  = {"gin","zen","gig","msg"};

        int expected = 2;
        int actual = solution.uniqueMorseRepresentations(words);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exampleTest02() {
        final String[] words  = {"a"};

        int expected = 1;
        int actual = solution.uniqueMorseRepresentations(words);

        Assert.assertEquals(expected, actual);
    }
}
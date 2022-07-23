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
        boolean shouldBeTrue = this.solution.backspaceCompare("ab#c", "ad#c");

        Assert.assertTrue(shouldBeTrue);
    }

    @Test
    public void exampleTest02() {
        boolean shouldBeTrue = this.solution.backspaceCompare("ab##", "c#d#");

        Assert.assertTrue(shouldBeTrue);
    }


    @Test
    public void exampleTest03() {
        boolean shouldBeFalse = this.solution.backspaceCompare("a#c", "b");

        Assert.assertFalse(shouldBeFalse);
    }
}
package main.test;

import main.java.PlusOne;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class PlusOneTest {
    private PlusOne plusOne;

    @Before
    public void setUp() {
        this.plusOne = new PlusOne();
    }

    @Test
    public void exampleTest01() {
        int[] arrayTest = {1,2,3};

        int[] expected = {1,2,4};

        int[] actual = plusOne.solutionPlusOne(arrayTest);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void exampleTest02() {
        int[] arrayTest = {4,3,2,1};

        int[] expected = {4,3,2,2};
        int[] actual = plusOne.solutionPlusOne(arrayTest);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void exampleTest03() {
        int[] arrayTest = {9};

        int[] expected = {1,0};
        int[] actual = plusOne.solutionPlusOne(arrayTest);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }


    @Test
    public void inputZeroShouldReturnOne() {
        int[] arrayTest = {0};

        int[] expected = {1};
        int[] actual = plusOne.solutionPlusOne(arrayTest);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }


    @Test
    public void inputNineAndNineShouldReturnOneZeroZero() {
        int[] arrayTest = {9, 9};

        int[] expected = {1, 0, 0};
        int[] actual = plusOne.solutionPlusOne(arrayTest);

        Assert.assertTrue(Arrays.equals(expected, actual));
    }
}
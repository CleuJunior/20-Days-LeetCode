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
        final String[] emails = {
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
        };

        int expected = 2;
        int actual = solution.numUniqueEmails(emails);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exampleTest02() {
        final String[] emails = {
                "a@leetcode.com",
                "b@leetcode.com",
                "c@leetcode.com"
        };

        int expected = 3;
        int actual = solution.numUniqueEmails(emails);

        Assert.assertEquals(expected, actual);
    }

}
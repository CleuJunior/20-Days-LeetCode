package main.test;


import main.java.ValidParentheses;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ValidParenthesesTest {
    private ValidParentheses validParentheses;

    @Before
    public void setUp()  {
        this.validParentheses = new ValidParentheses();
    }

    @Test
    public void test01() {
        boolean shouldBeTrue = validParentheses.isValid("()");

        Assert.assertTrue(shouldBeTrue);
    }

    @Test
    public void test02() {
        boolean shouldBeTrue = validParentheses.isValid("[]");

        Assert.assertTrue(shouldBeTrue);
    }

    @Test
    public void test03() {
        boolean shouldBeTrue = validParentheses.isValid("{}");

        Assert.assertTrue(shouldBeTrue);
    }

    @Test
    public void test04() {
        boolean shouldBeTrue = validParentheses.isValid("()[]{}");

        Assert.assertTrue(shouldBeTrue);
    }

    @Test
    public void test05() {
        boolean shouldBeTrue = validParentheses.isValid("{[]}");

        Assert.assertTrue(shouldBeTrue);
    }

    @Test
    public void test06() {
        boolean shouldBeFalse = validParentheses.isValid("({{{{}}}))");

        Assert.assertFalse(shouldBeFalse);
    }
}
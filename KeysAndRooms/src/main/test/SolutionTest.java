package main.test;

import main.java.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        this.solution = new Solution();
    }

    @Test
    public void exampleTest01() {
       boolean isTrue = solution.canVisitAllRooms(
                List.of(
                        List.of(1),
                        List.of(2),
                        List.of(3),
                        List.of()
                ));

        Assert.assertTrue(isTrue);
    }

    @Test
    public void exampleTest02() {
        boolean isFalse = solution.canVisitAllRooms(
                List.of(
                        List.of(1, 3),
                        List.of(3, 0, 1),
                        List.of(2),
                        List.of()
                ));

        Assert.assertFalse(isFalse);
    }

}

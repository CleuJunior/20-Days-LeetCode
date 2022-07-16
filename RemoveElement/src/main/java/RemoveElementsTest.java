import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveElementsTest {
    private RemoveElements removeElements;

    @Before
    public void setUp() {
        removeElements = new RemoveElements();
    }

    @Test
    public void testElements01() {
        int[] testArray = {4,9,8,8,4,8};
        int testVal = 4;

        int expected = 4;
        int actual = removeElements.Solution(testArray, testVal);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testElements02() {
        int[] testArray = {8,8,9,2};
        int testVal = 8;

        int expected = 2;
        int actual = removeElements.Solution(testArray, testVal);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testElements03() {
        int[] testArray = {18,28,48,38};
        int testVal = 9;

        int expected = 4;
        int actual = removeElements.Solution(testArray, testVal);

        Assert.assertEquals(expected, actual);
    }
}
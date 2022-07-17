package backtobasics.comparingobjects;



import org.junit.Assert;
import org.junit.Test;

public class ComparingObjectsTest {

    @Test
    public void equalTest() {
        int actual = 5;
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }
}

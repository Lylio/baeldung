package backtobasics.comparingobjects;

import org.junit.*;

import static org.junit.Assert.*;
public class ComparingObjects {

    @Test
    public void equalTest() {
        int actual = 5;
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

}

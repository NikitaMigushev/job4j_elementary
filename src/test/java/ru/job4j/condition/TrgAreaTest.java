package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TrgAreaTest {

    @Test
    public void whenP6K2ThenSquare2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP1K1ThenSquare0dot06() {
        float expected = 0.06f;
        int p = 1;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP1K0ThenSquare0() {
        int expected = 0;
        int p = 1;
        double k = 0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
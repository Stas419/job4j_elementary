package ru.job4j.condition;

import junit.framework.TestCase;
import org.junit.Assert;

public class SqArTest extends TestCase {

    public void testSquare() {
        int expected =  15;
        int p = 5;
        int k = 3;
        double out = SqAr.square(p, k);
        Assert.assertEquals(expected, out, 0);
    }

    public void testSquare2() {
        int expected =  16;
        int p = 2;
        int k = 8;
        double out = SqAr.square(p, k);
        Assert.assertEquals(expected, out, 0);
    }

    public void testSquare3() {
        int expected =  48;
        int p = 12;
        int k = 4;
        double out = SqAr.square(p, k);
        Assert.assertEquals(expected, out, 0);
    }
}
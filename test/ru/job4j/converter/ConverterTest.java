package ru.job4j.converter;

import junit.framework.TestCase;
import org.junit.Assert;

public class ConverterTest extends TestCase {

    public void testRubleToDollar() {
        int in = 180;
        int expected = 180;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    public void testRubleToDollar1() {
        int in = 180;
        int expected = 90;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }
}
package ru.job4j.converter;

import junit.framework.TestCase;
import org.junit.Assert;

public class ConverterTest extends TestCase {

    public void testRubleToDollar() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}
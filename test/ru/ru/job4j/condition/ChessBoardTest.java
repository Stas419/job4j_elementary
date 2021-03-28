package ru.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class ChessBoardTest {

    public static  int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {

            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }

    public static void main(String[] agrs) {
        int abs = ChessBoardTest.way(0, 0, 5, 5);
        System.out.print(abs);
    }

    @Test
    public void wayIs5() {
        int x1 = 6;
        int y1 = 7;
        int x2 = 1;
        int y2 = 2;
        int result = way(x1, y1, x2, y2);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wayIs7() {
        int x1 = 7;
        int y1 = 0;
        int x2 = 0;
        int y2 = 7;
        int result = way(x1, y1, x2, y2);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void wayIs0() {
        int x1 = 2;
        int y1 = 6;
        int x2 = 4;
        int y2 = 1;
        int result = way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}

package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return -1;
    }

    public static void main(String[] args) {
        int in = 140;
        int in2 = 250;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        int out2 = Converter.rubleToDollar(in2);
        boolean passed = out == expected;
        boolean passed2 = out2 == expected;
        System.out.println("140 rubles are " + passed + " euro");
        System.out.println("140 rubles are " + passed2 + " dollar");
    }
}

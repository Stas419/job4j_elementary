package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p/(2*(k+1));
        double L = h * k;
        double s = L * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(48, 9);
        System.out.println(" p = 48, k = 9, s = 1, real = " + result1);
    }
}

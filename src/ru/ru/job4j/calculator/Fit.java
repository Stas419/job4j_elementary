package ru.ru.job4j.calculator;

public class Fit {
    public static double manWeight(short heightMan) {
        double rsl = (heightMan - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short heightWoman) {
        double rsl = (heightWoman - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 165;

        double man = Fit.manWeight(heightMan);
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 165 is " + man);
    }
}

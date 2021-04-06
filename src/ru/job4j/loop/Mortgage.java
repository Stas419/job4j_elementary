package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double zp = 0;
        double debt = amount;

        double a = percent / 100;

        while (debt > zp){
            zp += salary;
            debt += amount * a;
            year++;
        }
        return year;
    }

    public static void main(String[] args){
        System.out.print(year(100, 70, 50));
    }
}

package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "Саша Иванов";
        names[1] = "Маша Печкина";
        names[2] = "Коля Семенов";
        names[3] = "Ваня Попов";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);


        System.out.println("Размер ages массива равен: " + ages.length);
        System.out.println("Размер surnames массива равен: " + surnames.length);
        System.out.println("Размер prices массива равен: " + prices.length);
    }
}

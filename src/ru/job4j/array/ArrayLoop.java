package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] mass = new int[5];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = i * 2 + 3;
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}

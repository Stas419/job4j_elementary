package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int sum = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (sum >= coins[i]) {
                rsl[i] = coins[i];
                sum = sum - rsl[i];
                size ++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {

        int[] mass = Machine.change(100, 31);
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}




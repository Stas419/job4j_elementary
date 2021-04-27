package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int point = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] != null) {
                    array[i] = array[i];
                }
            }
            System.out.print(array[i] + " ");
        }
        return array;
    }


}

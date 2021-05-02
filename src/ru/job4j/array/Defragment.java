package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] != null) {
                    array[i] = array[j];
                    array[j] = null;
                    break;
                }
            }
            System.out.print(array[i] + " ");
        }
        return array;
    }


}

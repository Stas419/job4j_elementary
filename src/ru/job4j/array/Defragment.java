package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int point = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null){
                array[num] = array[i];
                num++;
            }
            if (array[i] == null) {
                for (int j = 0; j < array.length-i; j++) {
                    array[array.length - 1 - j ] = array[i];

                }
            }
            System.out.print(array[i] + " ");
        }
        return array;
    }


    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}

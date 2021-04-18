package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int num;
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0 , data.length -1 );
            int index = FindLoop.indexOf(data, min, 0 , data.length -1);
            num = data[i];
            data[i] = data[index];
            data[index] = num;
        }
        return data;
    }
}

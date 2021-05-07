package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int a = left.length;
        int b = right.length;
        int i = 0, j = 0, k = 0;
            while(i < a && j < b){
                if(left[i] <= right[j]){
                    rsl[k] = left[i];
                    i++;
                }
                else{
                    rsl[k] = right[j];
                    j++;
                }
                k++;
            }
            while(i < a){
                rsl[k] = left[i];
                i++;
                k++;
            }
            while(j < b){
                rsl[k] = right[j];
                j++;
                k++;
            }
        return rsl;
    }

}

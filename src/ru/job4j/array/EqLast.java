package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = false;
        for (int i = 0; i < left.length; i++) {
            if(left[left.length-1] == right[left.length-1]){
                result = true;
            }
        }
        return result;
    }
}

package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left;
        if(right > left){
            result = right;
        }
        return result;
    }
}

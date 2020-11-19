package ru.job4j.condition;

public class Max {
    public static int max (int left, int right){
        int result = left > right ? 1: 2;
        return result;
    }
    public static void main(String [] args){
        int result = Max.max(3, 5);
        System.out.print(result);

    }
}

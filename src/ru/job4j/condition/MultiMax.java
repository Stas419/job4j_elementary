package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if(second > result){
            result = second;
        }
        else if(third > result){
            result = third;
        }
        return result;
    }

    public static void main(String[] args){
        int x = MultiMax.max(22,13,8);
        System.out.println(x);

    }
}

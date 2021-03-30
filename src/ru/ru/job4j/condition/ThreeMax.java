package ru.ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = 0;
        if (first > second || first > third) {
            result = first;
        }
        else if (second > first || second > third) {
            result = second;
        }
        else {
            result = third;
        }

        return result;
    }
}

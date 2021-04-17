package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
         for (int i = 0; i < pref.length; i++) {
            if (pref[i] != word[i]) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        System.out.println(ArrayChar.startsWith(word, pref));
    }
}

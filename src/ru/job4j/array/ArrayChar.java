package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = false;
         for (int i = 0; i < pref.length; i++) {
            if (pref[i] == 'H' && pref[i] == 'i') {
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        System.out.println(ArrayChar.startsWith(word, pref));
    }
}

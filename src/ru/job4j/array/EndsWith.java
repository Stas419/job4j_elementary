package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (post[post.length - 1 - i] != word[word.length - 1 - i]) {
                result = false;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        System.out.println(EndsWith.endsWith(word, post));
    }
}

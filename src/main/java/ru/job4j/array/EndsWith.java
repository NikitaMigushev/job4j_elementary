package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            int start = word.length - post.length + i;
            if (word[start] != post[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

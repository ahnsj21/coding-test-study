package chapter1.p5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        String result = new Main().solution(str);
        System.out.println(result);
    }

    private String solution(String str) {
        String result = "";

        char[] chars = str.toCharArray();
        int f = 0;
        int r = chars.length-1;
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isAlphabetic(chars[f])) {
                f++;
            } else if (!Character.isAlphabetic(chars[r])) {
                r--;
            } else {
                if (f < r) {
                    char temp = chars[f];
                    chars[f] = chars[r];
                    chars[r] = temp;
                    f++;
                    r--;
                }
            }
        }
        result = String.valueOf(chars);
        return result;
    }
}

package chapter1.p5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

//        String result = new Main().solution(str);
        String result = new Main().solve(str);
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

    public String solve(String str) {
        int frontIdx = 0;
        int tailIdx = str.length()-1;

        char[] chars = str.toCharArray();
        while ((tailIdx - frontIdx) > 1) {
            if (!Character.isAlphabetic(chars[frontIdx])) {
                frontIdx++;
            } else if (!Character.isAlphabetic(chars[tailIdx])) {
                tailIdx--;
            } else {
                char temp = chars[frontIdx];
                chars[frontIdx] = chars[tailIdx];
                chars[tailIdx] = temp;
                frontIdx++;
                tailIdx--;
            }
        }
        return String.valueOf(chars);
    }
}

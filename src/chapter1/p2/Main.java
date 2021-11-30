package chapter1.p2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] chars = str.toCharArray();
        char[] upperChars = str.toUpperCase().toCharArray();
        char[] lowerChars = str.toLowerCase().toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == upperChars[i]) {
                result += lowerChars[i];
            } else {
                result += upperChars[i];
            }
        }
        System.out.println(result);
    }
}

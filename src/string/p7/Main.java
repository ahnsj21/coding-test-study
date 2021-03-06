package string.p7;

import java.util.Scanner;

public class Main {

    public String solve(String str) {
        str = str.toLowerCase();

//        char[] chars = str.toCharArray();
//        for (int i=(chars.length-1); i>=0; i--) {
//
//        }
        String reverseStr = new StringBuffer(str).reverse().toString();
        return str.equals(reverseStr) ? "YES" : "NO";

    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
//        System.out.println(main.solution3(kb.nextLine()));
        System.out.println(main.solve(kb.nextLine()));
    }

    private String solution(String str) {
        char[] chars = str.toCharArray();
        String result = "YES";
        for (int i = 0; i < chars.length; i++) {
            boolean isEq = Character.toString(chars[i])
                    .equalsIgnoreCase(Character.toString(chars[chars.length-1-i]));
            if (!isEq) {
                result = "NO";
                break;
            }
        }
        return result;
    }

    private String solution2(String str) {
        String result = "YES";
        str = str.toUpperCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)) {
                return "NO";
            }
        }
        return result;
    }

    private String solution3(String str) {
        String result = "YES";
        String reverseStr = new StringBuilder(str).reverse().toString();
        if (!str.equalsIgnoreCase(reverseStr)) {
            result = "NO";
        }
        return result;
    }
}

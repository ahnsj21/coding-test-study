package string.p6;

import java.util.Scanner;

public class Main {

    public String solve(String str) {
        String result = "";
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
//        String result = main.solution2(str);
        String result = main.solve(str);
        System.out.println(result);
    }

    private String solution1(String str) {
        String result = "";

        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (result.length() == 0) {
                result += String.valueOf(c);
            } else {
                if (!result.contains(String.valueOf(c))) {
                    result += String.valueOf(c);
                }
            }
        }
        return result;
    }

    private String solution2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}

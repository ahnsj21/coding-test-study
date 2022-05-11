package string.p8;

import java.util.Scanner;

public class Main {

    public String solve(String str) {
        String replacedStr = "";
        for (int i = 0; i < str.length(); i++) {
            replacedStr += Character.isAlphabetic(str.charAt(i)) ?
                    str.charAt(i) : "";
        }
        String reverseReplaceStr = new StringBuffer(replacedStr).reverse().toString();
        return replacedStr.equalsIgnoreCase(reverseReplaceStr) ? "YES" : "NO";
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
//        System.out.println(main.solution2(kb.nextLine()));
        System.out.println(main.solve(kb.nextLine()));
    }

    private String solution1(String str) {
        String result = "YES";
        String alphabet = "";

        for (int i=0; i<str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                alphabet += str.charAt(i);
            }
        }

        String reverseAlphabet = new StringBuilder(alphabet).reverse().toString();
        if (!reverseAlphabet.equalsIgnoreCase(alphabet)) {
            result = "NO";
        }
        return result;
    }

    private String solution2(String str) {
        String result = "YES";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reverseStr = new StringBuilder(str).reverse().toString();
        if (!reverseStr.equals(str)) {
            result = "NO";
        }
        return result;
    }
}

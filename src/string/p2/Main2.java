package string.p2;

import java.util.Scanner;

public class Main2 {

    public String solution1(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }
        return answer;
    }

    // 대문자 65-90
    // 소문자 97-122
    public String solution2(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if (c >= 65 && c <= 90) {
                answer += (char)(c+32);
            } else {
                answer += (char)(c-32);
            }
        }
        return answer;
    }

    public String solve(String str) {
        String result = "";

        char[] charArr = str.toCharArray();
        for (char c : charArr) {
            char changedChar = Character.isLowerCase(c) ?
                    Character.toUpperCase(c) : Character.toLowerCase(c);
            result += changedChar;
        }
        return result;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

//        System.out.print(T.solution2(str));
        System.out.print(T.solve(str));
    }
}

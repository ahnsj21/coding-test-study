package chapter1.p11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println(main.solution(scanner.next()));
    }

    private String solution(String str) {
        String result = "";

        int i = 0;
        while (i < str.length()) {
            char c1 = str.charAt(i);
            int cnt = 1;
            for (int j = i + 1; j < str.length(); j++) {
                char c2 = str.charAt(j);
                if (c1 == c2) {
                    cnt++;
                } else {
                    break;
                }
            }

            result += Character.toString(c1);

            if (cnt > 1) {
                result += cnt;
            }

            i += cnt;
        }
        return result;
    }
}

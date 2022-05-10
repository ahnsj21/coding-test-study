package chapter1.p11;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    /**
     * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
     * K, K, H, S, S, S, S, S, S, S, E
     *
     */
    private String solve(String str) {
        str += " ";
        String result = "";
        int dupCnt = 1;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = i+1; j < str.length(); j++) {
                System.out.println("i : " + i + ", j : " + j);
                char nc = str.charAt(j);
                if (c == nc) {
                    dupCnt += 1;
                } else {
                    result += dupCnt == 1 ?
                            Character.toString(c) :
                            (Character.toString(c) + dupCnt);
                    i = i + (dupCnt-1);
                    dupCnt = 1;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
//        System.out.println(main.solution(scanner.next()));
        System.out.println(main.solve(scanner.next()));
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

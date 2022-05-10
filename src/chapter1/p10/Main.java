package chapter1.p10;

import java.util.Scanner;

public class Main {

    // t, e, a, c, h, e, r, m, o, d, e
    public int[] solve(String str, char t) {
        int[] result = new int[str.length()];
        int distance = 1000;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == t) {
                distance = 0;
            } else {
                distance += 1;
                result[i] = distance;
            }
        }

        distance = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c == t) {
                distance = 0;
            } else {
                distance += 1;
                result[i] = Math.min(result[i], distance);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char target = scanner.next().charAt(0);
//        int[] results = main.solution(str, target);
        int[] results = main.solve(str, target);
        for (int result : results) {
            System.out.print(result + " ");
        }
    }

    private int[] solution(String str, char target) {
        char[] chars = str.toCharArray();
        int[] results = new int[chars.length];
        int distance = 1000;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == target) {
                distance = 0;
            } else {
                distance += 1;
            }
            results[i] = distance;
        }

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == target) {
                distance = 0;
            } else {
                distance += 1;
            }

            results[i] = results[i] < distance ? results[i] : distance;
        }

        return results;
    }
}

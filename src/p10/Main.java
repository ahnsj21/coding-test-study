package p10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char target = scanner.next().charAt(0);
        int[] results = main.solution(str, target);
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

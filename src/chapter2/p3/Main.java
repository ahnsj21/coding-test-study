package chapter2.p3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        int[] arrayA = new int[cnt];
        int[] arrayB = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arrayA[i] = scanner.nextInt();
        }
        for (int i = 0; i < cnt; i++) {
            arrayB[i] = scanner.nextInt();
        }

        String[] resultArray = main.solution(cnt, arrayA, arrayB);
        for (String result : resultArray) {
            System.out.println(result);
        }
    }

    private String[] solution(int cnt, int[] arrayA, int[] arrayB) {
        String[] resultArray = new String[cnt];

        // 1 - 2 = -1 : A패
        // 1 - 3 = -2 : A승

        // 2 - 3 = -1 : A패
        // 2 - 1 = 1 : A 승

        // 3 - 1 = 2 : A패
        // 3 - 2 = 1 : A승
        for (int i = 0; i < cnt; i++) {
            int result = arrayA[i] - arrayB[i];
            if (result == 0) {
                resultArray[i] = "D";
            } else {
                if (result == -1 || result == 2) {
                    resultArray[i] = "B";
                } else {
                    resultArray[i] = "A";
                }
            }
        }

        return resultArray;
    }


}

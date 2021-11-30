package chapter2.p4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int[] resultArr = main.solution(cnt);
        for (int result : resultArr) {
            System.out.print(result + " ");
        }
    }

    private int[] solution(int cnt) {
        int[] resultArr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            if (i == 0 || i == 1) {
                resultArr[i] = 1;
            } else {
                resultArr[i] = resultArr[i - 2] + resultArr[i - 1];
            }
        }
        return resultArr;
    }
}

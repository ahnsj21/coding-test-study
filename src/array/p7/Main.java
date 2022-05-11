package array.p7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = main.solution2(cnt, arr);
        System.out.println(result);
    }

    private int solution(int cnt, int[] arr) {
        int totalScore = 0;

        int temp = 0;
        for (int i = 0; i < cnt+1; i++) {
            if (i == cnt || arr[i] == 0) {
                for (int j = 0; j < temp; j++) {
                    totalScore += (j+1);
                }
                temp = 0;
            } else {
                temp++;
            }
        }
        return totalScore;
    }

    //20
    //0 0 0 0 0 0 1 0 0 1 0 0 0 1 0 0 0 1 1 1
    private int solution2(int cnt, int[] arr) {
        int totalScore = 0;

        int rightCnt = 0;
        for (int i = 0; i < cnt; i++) {
            if (arr[i] == 1) {
                rightCnt++;
                totalScore += rightCnt;
            } else {
                rightCnt = 0;
            }
        }
        return totalScore;
    }
}

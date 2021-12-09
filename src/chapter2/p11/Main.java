package chapter2.p11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int[][] arr = new int[cnt][cnt];
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(main.solution(cnt, arr));
    }

    private int solution(int cnt, int[][] arr) {
        int result = 0;
        int represent = 0;

        for (int i = 0; i < cnt; i++) { // i== 학생
            int totalCnt = 0;
            for (int j = 0; j < cnt; j++) { // j = 학년
                for (int k = 0; k < cnt; k++) {
                    if (j != k) {
                        if (arr[j][i] == arr[k][i]) {
                            totalCnt++;
                        }
                    }
                }
            }
        }

        return result;
    }
}

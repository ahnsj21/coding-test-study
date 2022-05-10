package chapter2.p11;

import java.util.Scanner;
// todo : 어려움
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int[][] arr = new int[cnt][5];
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(main.solution(cnt, arr));
    }

    private int solution(int cnt, int[][] arr) {
        int result = 0;
        int max = 0;
        for (int i = 0; i < cnt; i++) {
            int eqCnt = 0;
            for (int j = 0; j < cnt; j++) {
                for (int k = 0; k < 5; k++) { // 학년
                    if (arr[i][k] == arr[j][k]) {
                        eqCnt++;
                        break;
                    }
                }
            }
            if (eqCnt > max) {
                max = eqCnt;
                result = i+1;
            }
        }

        return result;
    }
}

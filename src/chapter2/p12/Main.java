package chapter2.p12;

import java.util.Scanner;

// todo : fail
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int studentCnt = scanner.nextInt();
        int testCnt = scanner.nextInt();
        int[][] arr = new int[testCnt][studentCnt];
        for (int i = 0; i < testCnt; i++) {
            for (int j = 0; j < studentCnt; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(main.solution(studentCnt, testCnt, arr));
    }

    private int solution(int studentCnt, int testCnt, int[][] arr) {
        int result = 0;

        for (int i = 0; i < studentCnt; i++) {
            for (int j = 0; j < studentCnt-1; j++) {
                int sa = arr[i][j];
                int sb = arr[i][j+1];
                for (int k =0; k<testCnt; k++) {
                    int saRank = 0;
                    int sbRank = 0;
                    for (int l = 0; l < studentCnt; l++) {
                        if (arr[k][l] == sa) {
                            saRank = k;
                        }
                        if (arr[k][l] == sb) {
                            sbRank = k;
                        }
//                        if (saRank) {
//                        }
                    }
                }

            }
        }
        return result;
    }
}

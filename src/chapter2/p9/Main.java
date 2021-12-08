package chapter2.p9;

import java.util.Scanner;

/**
 * Developer :: Ahn Seong-jin
 * Date :: 2021/12/08
 * Description ::
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(main.solution(n, arr));
    }

    /**
     * 10 13 10 12 15
     * 12 39 30 23 11
     * 11 25 50 53 15
     * 19 27 29 37 27
     * 19 13 30 13 19
     * @param n
     * @param arr
     * @return
     */
    private int solution(int n, int[][] arr) {
        int max = 0;

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            max = max < rowSum ? rowSum : max;
            max = max < colSum ? colSum : max;
        }

        int leftCrossSum = 0;
        for (int i = 0; i < n; i++) {
            leftCrossSum += arr[i][i];
        }
        max = max < leftCrossSum ? leftCrossSum : max;

        int rightCrossSum = 0;
        for (int i = 0; i < n; i++) {
            rightCrossSum += arr[i][n-1-i];
        }
        max = max < rightCrossSum ? rightCrossSum : max;

        return max;
    }
}

package chapter2.p10;

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

        System.out.println(main.solution2(cnt, arr));
    }

    private int solution(int cnt, int[][] arr) {
        int result = 0;

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                // 위쪽 비교
                if (i != 0) {
                    if (arr[i][j] <= arr[i - 1][j]) {
                        continue;
                    }
                }
                // 왼쪽 비교
                if (j != 0) {
                    if (arr[i][j] <= arr[i][j-1]) {
                        continue;
                    }
                }
                // 아래쪽 비교
                if (i != (cnt - 1)) {
                    if (arr[i][j] <= arr[i+1][j]) {
                        continue;
                    }
                }
                // 오른쪽 비교
                if (j != (cnt - 1)) {
                    if (arr[i][j] <= arr[i][j+1]) {
                        continue;
                    }
                }
                result++;
            }
        }
        return result;
    }

    private int solution2(int cnt, int[][] arr) {
        int result = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                boolean max = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < cnt && ny >= 0 && ny < cnt && arr[i][j] <= arr[nx][ny]) {
                        max = false;
                        break;
                    }
                }
                if (max == true) {
                    result++;
                }
            }
        }

        return result;
    }
}

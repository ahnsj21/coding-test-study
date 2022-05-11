package array.p8;

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
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] resultArr = main.solution(n, arr);
        for (int result : resultArr) {
            System.out.print(result + " ");
        }
    }

    // 6
    // 87 89 87 92 100 76
    private int[] solution(int n, int[] arr) {

        int[] rankingArr = new int[n];
        for (int i = 0; i < n; i++) {
            int ranking = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    ranking++;
                }
            }
            rankingArr[i] = ranking;
        }
        return rankingArr;
    }


}

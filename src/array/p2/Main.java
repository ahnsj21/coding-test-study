package array.p2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        int[] array = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(main.solution(array));
    }

    private int solution(int[] array) {
        int result = 0;
        int maxHeight = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                maxHeight = array[i];
                result++;
            } else {
                if (maxHeight < array[i]) {
                    maxHeight = array[i];
                    result++;
                }
            }
        }

        return result;
    }
}

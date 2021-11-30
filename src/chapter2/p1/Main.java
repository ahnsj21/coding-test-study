package chapter2.p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Package :: chapter2.chapter1.p1
 * Developer :: Ahn Seong-jin
 * Date :: 2021/11/30
 * Description ::
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int[] array = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            array[i] = scanner.nextInt();
        }
        List<Integer> resultList = main.solution(array);
        for (int result : resultList) {
            System.out.print(result + " ");
        }
    }

    private List<Integer> solution(int[] array) {

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            // 첫번째 수 무조건 출력
            if (i == 0) {
                resultList.add(array[i]);
            } else {
                if (array[i] > array[i-1]) {
                    resultList.add(array[i]);
                }
            }
        }

        return resultList;
    }
}

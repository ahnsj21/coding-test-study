package chapter2.p6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int array[] = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            array[i] = scanner.nextInt();
        }

        List<Integer> resultList = main.solution(cnt, array);

        for (int result : resultList) {
            System.out.print(result + " ");
        }
    }

    /**
     * 숫자 뒤집기 공식
     * reverse 초기값 0
     * number = 123
     *
     * 1. 나머지 연산으로 끝자리 구하기 :                             [123 % 10 = 3]     [12 % 10 = 2]       [1 % 10 = 1]
     * 2. 자릿수 지정(반복문 돌때마다 1, 10, 100의 자리 되도록) :        [0 * 10 + 3 = 3]   [3 * 10 + 2 = 32]   [32 * 10 + 1 = 321]
     * 3. 나머지 연산으로 구한 마지막 자리 없애기 :                     [123 / 10 = 12]    [12 / 10 = 1]       [1 / 10 = 0]
     *
     * remain = number % 10 (나머지 연산으로 맨 마지막 자리 구함)
     * reverseNumber = reverseNumber * 10 + remain (곱하기 10을 하여 자릿수 이동시킨 후 위에서 구한 나머지는 더하기 하여 일의 자리에 배치)
     * number = number/10 (나누기 연산으로 일의 자리 없앰)
     *
     * @param array
     * @return
     */
    private List<Integer> solution(int cnt, int[] array) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            int reverseNumber = 0;
            int number = array[i];
            while (number > 0) {
                int remain = number % 10;
                reverseNumber = reverseNumber * 10 + remain;
                number = number / 10;
            }
            if (isPrime(reverseNumber)) {
                resultList.add(reverseNumber);
            }
        }

        return resultList;
    }

    private boolean isPrime(int number) {
        if(number == 1) {
            return false;
        }
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

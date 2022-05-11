package array.p5;

import java.util.Scanner;

/**
 * Package :: chapter2.p5
 * Developer :: Ahn Seong-jin
 * Date :: 2021/12/01
 * Description ::
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = main.solution2(number);
        System.out.println(result);
    }

    // 성능 실패
    private int solution(int number) {
        int result = 0;
        if (number > 2) {
            for (int i = 2; i <= number; i++) {
                boolean isPrime = true;
                for (int j=2; j<i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    result ++;
                }
            }
        }
        return result;
    }

    /**
     * 에라토스테네스 체
     *
     * 1. int 형 배열을 cnt+1 개만큼 초기화 (배열의 인덱스를 활용할 것이므로 +1)
     * 2. 배열의 두번째 인덱스 부터 반복문 시작
     * 3. 배열의 i번째 인덱스의 값이 0이면 result에 +1 한 후 배열에서 i번째 인덱스의 값의 배수는 1로 표시 (특정수의 배수면 소수 아님)
     * 4. 배열의 i번째 인덱스가 1이면 skip (i번째 인덱스의 값이 1이라는 것은 이전 수의 배수라는 의미)
     *
     * @param cnt
     * @return
     */
    private int solution2(int cnt) {
        int result = 0;
        int[] array = new int[cnt+1];
        for (int i = 2; i <= cnt; i++) {
            if (array[i] == 0) {
                result++;
                for (int j = i; j <= cnt; j=j+i) {
                    array[j] = 1;
                }
            }
        }
        return result;
    }
}

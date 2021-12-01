package chapter2.p5;

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
        int result = main.solution(number);
        System.out.println(result);
    }

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
}

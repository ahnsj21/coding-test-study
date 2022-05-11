package recursive.p3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = main.solution(n);
        System.out.println("result = " + result);
    }

    private int solution(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * solution(n-1);
        }
    }
}

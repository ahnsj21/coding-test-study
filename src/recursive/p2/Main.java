package recursive.p2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        main.solution(n);
    }

    private void solution(int n) {
        if (n == 0) {
            return;
        } else {
            solution(n/2);
            System.out.print(n%2);
        }
    }
}

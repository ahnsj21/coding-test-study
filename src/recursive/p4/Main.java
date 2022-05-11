package recursive.p4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        main.solution(n);
    }

    private int[] checkedArr = null;

    public void solution(int n) {
        checkedArr = new int[n+1];
        recursive(n);
        for (int i = 1; i < n; i++) {
//            System.out.print(recursive(i) + " ");
            System.out.print(checkedArr[i] + " ");
        }
    }

    public int recursive(int n) {
        if (n == 1 || n == 2) {
            checkedArr[n] = 1;
            return checkedArr[n];
        }

        checkedArr[n] = recursive(n - 2) + recursive(n - 1);
        return checkedArr[n];
    }

//    public int recursive(int n) {
//        if (n == 1 || n == 2) {
//            return 1;
//        }
//
//        return recursive(n - 2) + recursive(n - 1);
//    }
}

package twopointer.p5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main t = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = t.solution(n);
        System.out.println(cnt);
    }

    private int solution(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
            System.out.println(arr[i]);
        }

        int cnt = 0;
        int lt = 0;
        int sum = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == n) {
                System.out.println("lt : " + lt + ", rt : " + rt);
                cnt++;
            }

            while (sum >= n && rt < n-1) {
                sum -= arr[lt++];
                if (sum == n) {
                    System.out.println("lt : " + lt + ", rt : " + rt);
                    cnt++;
                }
            }
        }

        return cnt;
    }
}

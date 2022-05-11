package twopointer.p4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }

    private int solution(int n, int m, int[] arr) {
        int result = 0;
        int lt = 0, sum = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                result++;
            }

            while (sum >= m) {
                sum -= arr[lt];
                lt++;
                if (sum == m) {
                    result++;
                }
            }

        }
        return result;
    }
}

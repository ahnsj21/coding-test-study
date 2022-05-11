package stackqueue.p6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = main.solution(n, k);
        System.out.println(result);
    }

    private int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i + 1);
        }

        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                Integer poll = queue.poll();
                queue.offer(poll);
            }
            queue.poll();
        }
        return queue.poll();
    }
}

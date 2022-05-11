package stackqueue.p7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String required = scanner.next();
        String plane = scanner.next();
        String result = main.solution(required, plane);
        System.out.println(result);
    }

    private String solution(String required, String plane) {
        Queue<Character> queue = new LinkedList<>();
        for (char c : required.toCharArray()) {
            queue.offer(c);
        }

        for (char c : plane.toCharArray()) {
            boolean isRequired = queue.contains(c);
            if (isRequired) {
                if (queue.peek() == c) {
                    queue.poll();
                }
            }
        }
        return queue.isEmpty() ? "YES" : "NO";
    }
}

package stackqueue.p4;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int result = main.solution(str);
        System.out.println(result);
    }

    private int solution(String str) {
        int result = 0;

        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                int right = stack.pop();
                int left = stack.pop();
                int value = calc(left, right, c);
                stack.push(value);
            }
        }
        result = stack.get(0);
        return result;
    }

    private int calc(int left, int right, char operation) {
        if (operation == '+') {
            return left + right;
        } else if (operation == '-') {
            return left - right;
        } else if (operation == '*') {
            return left * right;
        } else {
            return left / right;
        }
    }
}

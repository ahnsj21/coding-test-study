package stackqueue.p2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String result = main.solution(str);
        System.out.println(result);
    }

    private String solution(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            stack.add(c);

            Character peek = stack.peek();
            if (peek == ')') {
                while (stack.peek() != '(') {
                    Character pop = stack.pop();
                }
                Character pop2 = stack.pop();
            }
        }
        String result = "";
        for (int i = 0; i < stack.size(); i++) {
            result += stack.get(i);
        }

        return result;
    }
}

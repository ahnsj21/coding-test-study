package chapter1.p1;

import java.util.Scanner;

public class Main {
    public int solution(String str, char t) {
        int answer = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (Character.toUpperCase(c) == t ||
                    Character.toLowerCase(c) == t) {
                answer += 1;
            }
        }
        return answer;
    }

    public int solve(String str, char c) {
        int result = 0;
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        for (char ch : arr) {
            if (ch == c) {
                System.out.println("match");
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

//        System.out.print(T.solution(str, c));
        System.out.print(T.solve(str, c));
    }
}

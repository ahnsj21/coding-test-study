package p1;

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

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.print(T.solution(str, c));
    }
}

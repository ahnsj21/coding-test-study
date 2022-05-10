package chapter1.p3;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String[] array = str.split(" ");
        String answer = array[0];
        for (int i=0; i<array.length-1; i++) {
            if (array[i].length() >= array[i+1].length() &&
                    array[i].length() > answer.length()) {
                answer = array[i];
            } else {
                if (array[i+1].length() > answer.length()) {
                    answer = array[i+1];
                }
            }
        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "";

        String[] arrays = str.split(" ");
        int maxLen = 0;
        for (String s : arrays) {
            if (s.length() > maxLen) {
                maxLen = s.length();
                answer = s;
            }
        }
        return answer;
    }

    public String solve(String str) {
        String result = "";

        String[] strArr = str.split(" ");
        for (String word : strArr) {
            if (word.length() > result.length()) {
                result = word;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

//        System.out.print(T.solution2(str));
        System.out.print(T.solve(str));
    }
}

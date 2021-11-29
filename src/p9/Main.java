package p9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        System.out.println(main.solution2(kb.next()));
    }

    private int solution1(String str) {
        String number = "0";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                number += str.charAt(i);
            }
        }
        return Integer.valueOf(number);
    }

    // 숫자 ascii 48-57
    // 자리수를 옴겨가며 응답 값을 누적
    /*1=0*10+(49-48)
    12=1*10+(50-48)
    125=12*10+(53-48)
    1258=125*10+(56-48)*/
    private int solution2(String str) {
        int answer = 0;
        char[] chars = str.toCharArray();
        for (int i=0; i < chars.length; i++) {
            if (chars[i] >= 48 && chars[i] <= 57) {
                answer = answer * 10 + (chars[i] - 48);
            }
        }
        return answer;
    }
}

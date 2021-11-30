package p12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int wordCnt = scanner.nextInt();
        String encryptStr = scanner.next();
        int[] resultArr = main.solution2(wordCnt, encryptStr);
        for (int result : resultArr) {
            System.out.print((char) result);
        }
    }

    private int[] solution1(int wordCnt, String encryptStr) {
        String biNo = encryptStr.replaceAll("#", "1").replaceAll("\\*", "0");
        int cnt = encryptStr.length() / wordCnt;
        String[] biNoArr = new String[biNo.length() / cnt];
        int[] resultArr = new int[biNoArr.length];
        for (int i = 0; i < biNo.length() / cnt; i++) {
            int begin = i * cnt;
            int end = begin + cnt;
            biNoArr[i] = biNo.substring(begin, end);

            // 2진수 -> 10진수
            char[] chars = biNoArr[i].toCharArray();
            int result = 0;
            for (int j = 0; j < chars.length; j++) {
                int value = Character.getNumericValue(chars[j]);
                for (int k = j; k < chars.length; k++) {
                    if (k == chars.length - 1) {
                        value = value * 1;
                    } else {
                        value = value * 2;
                    }
                }
                result += value;
            }
            resultArr[i] = result;
        }
        return resultArr;
    }

    private int[] solution2(int wordCnt, String encryptStr) {
        String biNo = encryptStr.replaceAll("#", "1").replaceAll("\\*", "0");
        int cnt = encryptStr.length() / wordCnt;
        String[] biNoArr = new String[biNo.length() / cnt];
        int[] resultArr = new int[biNoArr.length];

        for (int i = 0; i < biNo.length() / cnt; i++) {
            int begin = i * cnt;
            int end = begin + cnt;
            biNoArr[i] = biNo.substring(begin, end);
            int value = Integer.parseInt(biNoArr[i], 2);
            resultArr[i] = value;
        }
        return resultArr;

    }
}


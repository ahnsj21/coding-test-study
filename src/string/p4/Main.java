package string.p4;

import java.util.Scanner;

public class Main {
    public String[] solve(String[] strArr) {
        String[] resultStrArr = new String[strArr.length];

        for (int j=0; j<strArr.length; j++) {
            String reverseStr = "";
            char[] charArr = strArr[j].toCharArray();
            for (int i=charArr.length-1; i>=0; i--) {
                reverseStr += charArr[i];
            }
            resultStrArr[j] = reverseStr;
        }
        return resultStrArr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = kb.next();
        }

//        String[] resultList = T.solution2(array);
        String[] resultList = T.solve(array);
        for (String str : resultList) {
            System.out.println(str);
        }
    }

    private String[] solution1(String[] array) {
        String[] resultArray = new String[array.length];
        for (int i=0; i<array.length; i++) {
            char[] chars = array[i].toCharArray();
            String result = "";
            for (int j=chars.length-1; j>=0; j--) {
                result += chars[j];
            }
            resultArray[i] = result;
        }
        return resultArray;
    }

    private String[] solution2(String[] array) {
        String[] resultArray = new String[array.length];
        for (int i=0; i<array.length; i++) {
            resultArray[i] = new StringBuilder(array[i]).reverse().toString();
        }
        return resultArray;
    }

}

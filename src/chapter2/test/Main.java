package chapter2.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int result = main.solution(n);
        System.out.println(result);
    }

    private int solution(int n) {
        String str = String.valueOf(n);
        char[] ascArr = str.toCharArray();
        int ascVal = Integer.parseInt(IntStream.range(0, ascArr.length)
                .mapToObj(i -> ascArr[i])
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining()));

        int descVal = Integer.parseInt(IntStream.range(0, ascArr.length)
                .mapToObj(i -> ascArr[i])
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining()));
        return ascVal + descVal;

//        for(int i=0; i<ascArr.length-1; i++){
//            int idx=i;
//            for(int j=i+1; j<ascArr.length; j++){
//                if(ascArr[j]<ascArr[idx]) idx=j;
//            }
//            char tmp = ascArr[i];
//            ascArr[i] = ascArr[idx];
//            ascArr[idx] = tmp;
//        }
//        int ascVal = Integer.parseInt(new String(ascArr));
//
//        char[] descArr = new char[ascArr.length];
//        for (int i=0; i<descArr.length; i++) {
//            descArr[i] = ascArr[ascArr.length-i-1];
//        }
//        int descVal = Integer.parseInt(new String(descArr));
//
//        return ascVal + descVal;
    }


}

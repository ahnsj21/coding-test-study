package chapter4.p2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        String result = main.solve(str1, str2);
        System.out.println("result = " + result);
    }

    private String solve(String str1, String str2) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<str1.length(); i++) {
            char key = str1.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i<str2.length(); i++) {
            char key = str2.charAt(i);
            map.put(key, map.getOrDefault(key, 0) - 1);
        }

        Optional<Integer> any = map.values().stream().filter(value -> !value.equals(0)).findAny();
        return any.isEmpty() ? "YES" : "NO";
    }
}

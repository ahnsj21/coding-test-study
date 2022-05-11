package mapset.p1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        Character result = main.solve(n, str);
        System.out.println(result);
    }

    private Character solve(int n, String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char key = str.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int max = 0;
        char result = ' ';
        for (char c : map.keySet()) {
            Integer value = map.get(c);
            if (value > max) {
                result = c;
                max = value;
            }
        }

        return result;
    }
}

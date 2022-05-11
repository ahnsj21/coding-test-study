package mapset.p4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        int result = main.solve2(str1, str2);
        System.out.println(result);
    }

    private int solve(String str1, String str2) {
        int resultCnt = 0;
        for (int rt = str2.length() - 1; rt < str1.length(); rt++) {
            Map<Character, Integer> map = new HashMap();
            for (int lt = rt + 1 - str2.length(); lt <= rt; lt++) {
                char key = str1.charAt(lt);
                map.put(key, map.getOrDefault(key, 0)+1);
            }

            for (char c : str2.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0)-1);
            }
            boolean invalid = map.values().contains(-1);
            if (!invalid) {
                resultCnt++;
            }

        }
        return resultCnt;
    }

    private int solve2(String str1, String str2) {
        int result = 0;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : str2.toCharArray()) {
            map2.put(c, 1);
        }

        int l = str2.length() - 1;
        for (int i = 0; i < l; i++) {
            map1.put(str1.charAt(i), 1);
        }

        int lt = 0;
        for (int rt = l; rt < str1.length(); rt++) {
            char key = str1.charAt(rt);
            map1.put(key, map1.getOrDefault(key, 0) + 1);
            if (map1.equals(map2)) {
                result++;
            }
            map1.put(str1.charAt(lt), map1.get(str1.charAt(lt)) - 1);
            if (map1.get(str1.charAt(lt)) == 0) {
                map1.remove(str1.charAt(lt));
            }
            lt++;
        }
        return result;
    }
}

package mapset.p3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x : T.solution(n, k, arr)) System.out.print(x+" ");

    }

    private List<Integer> solution(int n, int k, int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int rt = k - 1; rt < n; rt++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int lt = rt + 1 - k; lt <= rt; lt++) {
                int key = arr[lt];
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            list.add(map.size());
        }
        return list;
    }
}

package recursive.p6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    List<String> resultList = new ArrayList<>();
    int[] checkArr;
    int n = 0;

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        main.n = scanner.nextInt();

        main.checkArr = new int[main.n + 1];
        main.dfs(1);

    }


    public void dfs(int val) {
        if (val > n) {
            for (int i = 1; i < checkArr.length; i++) {
                if(checkArr[i] !=0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(" ");
            return;
        }
        checkArr[val] = 1;
        dfs(val+1);

        checkArr[val] = 0;
        dfs(val+1);
    }
}

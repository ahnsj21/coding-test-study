package chapter3.p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        int m=kb.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=kb.nextInt();
        }
        for(int x : T.solution(n, m, a, b)) System.out.print(x+" ");

    }

    private int[] solution(int firstArrLen, int secondArrLen, int[] firstArr, int[] secondArr) {
        int resultArrLen = firstArrLen + secondArrLen;
        int[] resultArr = new int[resultArrLen];
        int fap = 0, sap = 0;

        for (int i = 0; i < resultArrLen; i++) {
            if (fap < firstArrLen && sap < secondArrLen) {
                if (firstArr[fap] <= secondArr[sap]) {
                    resultArr[i] = firstArr[fap];
                    fap += 1;
                } else {
                    resultArr[i] = secondArr[sap];
                    sap += 1;
                }
            } else {
                if (fap < firstArrLen) {
                    resultArr[i] = firstArr[fap];
                    fap += 1;
                }
                if (sap < secondArrLen) {
                    resultArr[i] = secondArr[sap];
                    sap += 1;
                }

            }
        }
        return resultArr;
    }
}

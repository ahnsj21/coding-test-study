package chapter5.p8;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }

    private int solution(int n, int m, int[] arr) {
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }
        int order = 0;
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            boolean isPriority = true;
            for (Person readyPerson : queue) {
                if (person.risk < readyPerson.risk) {
                    isPriority = false;
                    break;
                }
            }
            if (isPriority) {
                order++;
                if (person.id == m) {
                    break;
                }
            } else {
                queue.offer(person);
            }
        }
        return order;
    }
}

class Person {
    int id;
    int risk;

    public Person(int id, int risk) {
        this.id = id;
        this.risk = risk;
    }
}

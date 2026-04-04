package timus;

import java.util.Scanner;

public class Task_1787 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        int queue = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            queue += a;
            queue -= k;
            if (queue < 0) {
                queue = 0;
            }
        }

        System.out.println(queue);
    }
}

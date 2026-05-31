package timus;

import java.util.Scanner;

public class Task_1225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(2);
            return;
        }
        if (n == 2) {
            System.out.println(2);
            return;
        }

        long[] a = new long[n + 1];
        a[1] = 2;
        a[2] = 2;

        for (int i = 3; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }

        System.out.println(a[n]);
        sc.close();
    }
}

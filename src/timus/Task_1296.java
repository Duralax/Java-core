package timus;

import java.util.Scanner;

public class Task_1296 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N == 0) {
            System.out.println(0);
            return;
        }

        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < N; i++) {
            int p = sc.nextInt();
            currentSum += p;

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println(maxSum);
        sc.close();
    }

}

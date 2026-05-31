package timus;

import java.util.Scanner;

public class Task_1327 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int count = 0;
        for (int day = A; day <= B; day++) {
            if (day % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

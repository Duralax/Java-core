package timus;

import java.util.Scanner;

public class Task_1877 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code1 = sc.nextInt();
        int code2 = sc.nextInt();

        if (code1 % 2 == 0 || code2 % 2 == 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

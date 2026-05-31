package timus;

import java.util.Scanner;

public class Task_1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int oddNums = (n + 1) / 2;

        if (oddNums % 2 == 0){
            System.out.println("black");
        } else {
            System.out.println("grimy");
        }
        sc.close();

    }
}

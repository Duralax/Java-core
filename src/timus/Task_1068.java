package timus;

import java.util.Scanner;

public class Task_1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int result = 0;

        if (n >= 1){
            for (int i = 1; i <= n; i ++){
                result += i;
            }
        } else {
            for (int i = n; i <= 1; i++) {
                result += i;
            }
        }

        System.out.println(result);
    }
}

package timus;

import java.util.Scanner;

public class Task_1409 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int garry = sc.nextInt();
        int larry = sc.nextInt();

        int all = garry + larry - 1;
        System.out.println((all - garry) + " " + (all - larry));
    }
}

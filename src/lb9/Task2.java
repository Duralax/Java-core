package lb9;

import java.util.Scanner;

public class Task2 {
    public static void binary(int num){
        if (num > 1){
            binary(num / 2);
        }
        if (num % 2 == 0){
            System.out.print(0);
        } else {
            System.out.print(1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        binary(number);
    }
}

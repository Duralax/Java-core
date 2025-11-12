package lb1;

import java.util.Scanner;

//Задача 10
//Напишите программу, в которой Пользователь вводит два числа, а
//программой вычисляется и отображается сумма и разность этих чисел.

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int first_num = in.nextInt();

        System.out.println("Введите второе число: ");
        int second_num = in.nextInt();

        int sum = first_num + second_num;
        int diff = first_num - second_num;

        System.out.printf("Сумма введенных чисел: %d, разность: %d \n", sum, diff);
        in.close();
    }
}

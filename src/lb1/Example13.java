package lb1;

import java.util.Scanner;

//Задача 8
//Напишите программу для вычисления суммы двух чисел. Оба числа
//вводятся пользователем. Для вычисления суммы используйте оператор +.

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int first_num = in.nextInt();

        System.out.println("Введите второе число: ");
        int second_num = in.nextInt();

        int result = first_num + second_num;

        System.out.printf("Итог: %d + %d = %d \n", first_num, second_num, result);
        in.close();
    }
}

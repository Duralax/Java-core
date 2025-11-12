package lb1;

import java.util.Scanner;

// Задача 9
//Напишите программу, в которой пользователь вводит число, а программой
//отображается последовательность из четырех чисел: число, на единицу
//меньше введённого, введенное число и число, на единицу больше введенного.
//Четвертое число должно быть квадратом суммы первых трех чисел.

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();

        int num_minus = num - 1;
        int num_plus = num + 1;
        int num_3_sum = num_minus + num_plus + num;
        int num_pow = num_3_sum * num_3_sum;

        System.out.printf("Итог: число меньше на единицу = %d, введенное число = %d" +
                ", число больше на единицу = %d, квадрат этих чисел = %d \n", num_minus, num, num_plus, num_pow);
        in.close();
    }
}

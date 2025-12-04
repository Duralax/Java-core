package lb3;

import java.util.Scanner;

//3. Напишите программу, которая выводит последовательность чисел Фибоначчи.
// Первые два числа в этой последовательности равны 1, а каждое следующее число равно сумме двух предыдущих
// (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
// Количество чисел в последовательности вводится пользователем. Предложите версии программы, использующие разные операторы цикла.

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите кол-во чисел Фибоначчи в последовательности: ");
        int amount = in.nextInt();

        if (amount == 1){
            System.out.println(1);
        }
        if (amount >= 2) {
            System.out.println("Реализация цикла for: ");
            System.out.println(1 + "\n" + 1);

            int num1 = 1;
            int num2 = 1;
            int next_num;


            // цикл for
            for (int i = 2; i < amount; i++) {
                next_num = num1 + num2;
                System.out.println(next_num);
                num1 = num2;
                num2 = next_num;
            }
            System.out.println("\nРеализация цикла while: ");
            System.out.println(1 + "\n" + 1);

            num1 = 1;
            num2 = 1;
            int iterator = 2;

            // цикл for
            while (iterator < amount) {
                next_num = num1 + num2;
                System.out.println(next_num);
                num1 = num2;
                num2 = next_num;
                iterator++;
            }
        }
        in.close();

    }
}

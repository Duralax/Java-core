package lb3;

import java.util.Scanner;

//5. Напишите программу, в которой вычисляется сумма чисел, удовлетворяющих таким критериям:
// при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме вводится пользователем.
// Программа отображает числа, которые суммируются, и значение суммы. Предложите версии программы, использующие разные операторы цикла.

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите кол-во чисел в сумме");
        int amount = in.nextInt();

        System.out.println("Версия с циклом for:");

        int sum = 0;
        int iters = 0;

        for (int i = 0; iters < amount; i++){
            if (i % 5 == 2 || i % 3 == 1){
                sum += i;
                System.out.println("Число " + (iters + 1) + " в сумме: " + i );
                iters++;
            }
        }
        System.out.println("Сумма данных чисел = " + sum);

        System.out.println("\nВерсия с циклом while:");

        sum = 0;
        iters = 0;
        int num = 0;

        while (iters < amount){
            if (num % 5 == 2 || num % 3 == 1){
                sum += num;
                System.out.println("Число " + (iters + 1) + " в сумме: " + num );
                iters++;
            }
            num++;
        }
        System.out.println("Сумма данных чисел = " + sum);

    }
}

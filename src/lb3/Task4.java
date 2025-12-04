package lb3;

import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num1 = in.nextInt();

        System.out.println("Введите второе число:");
        int num2 = in.nextInt();

        int max = num1;
        int min = num2;

        if (num2 >= max){
            max = num2;
            min = num1;
        }

        System.out.println("Вывод чисел диапазона через for:");

        for (int i = min; i <= max; i++){
            System.out.println(i);
        }

        System.out.println("\nВывод чисел диапазона через while:");

        int iter = min;

        while (iter <= max){
            System.out.println(iter);
            iter++;
        }

        in.close();
    }
}

package lb2;

import java.util.Scanner;

//Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: при делении на 5 в остатке
//получается 2, а при делении на 7 в остатке получается 1

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();

        if (num % 5 == 2 && num % 7 == 1){
            System.out.printf("Число %d делится на 5 с остатком 2 и на 7 с остатком 1 \n", num);
        } else {
            System.out.printf("Число %d НЕ делится на 5 с остатком 2 или НЕ делится на 7 с остатком 1 \n", num);
        }
        in.close();
    }
}

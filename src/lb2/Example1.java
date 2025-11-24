package lb2;

import java.util.Scanner;

//Напишите программу, которая проверяет, делится ли введенное
//Пользователем число на 3

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = in.nextInt();


        if (num % 3 == 0){
            System.out.printf("Число %d делится на 3 \n", num);
        } else {
            System.out.printf("Число %d НЕ делится на 3 \n", num);
        }
        in.close();
    }
}

package lb2;

import java.util.Scanner;

//Напишите программу, которая проверяет, попадает ли введение
//пользователем число в диапазон от 5 до 10 включительно.

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();

        if (5 <= num && num <= 10){
            System.out.printf("Число %d больше 5 и меньше 10 включительно \n", num);
        } else {
            System.out.printf("Число %d НЕ больше 5 или НЕ меньше 10 включительно \n", num);
        }
        in.close();
    }
}

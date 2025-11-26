package lb2;

import java.util.Scanner;

//Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: число делится на 4, и при
//этом оно не меньше 10

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();

        if (num % 4 == 0 && num >= 10){
            System.out.printf("Число %d делится на 4 и не меньше 10 \n", num );
        } else {
            System.out.printf("Число %d НЕ делится на 4 или меньше 10 \n", num );
        }
        in.close();
    }
}

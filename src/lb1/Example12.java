package lb1;

import java.util.Scanner;

//Задача 7
//Напишите программу, в которой по возрасту определяется год рождения.

public class Example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int current_date = 2025;

        System.out.println("Введите возраст: ");
        int age = in.nextInt();

        int birth_year = current_date - age;

        System.out.printf("Ваш год рождения - %d! \n", birth_year); //можно и current_date-age
        in.close();
    }
}

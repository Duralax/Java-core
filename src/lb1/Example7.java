package lb1;

import java.util.Scanner;

//Задача 2
//Напишите программу, в которой Пользователь вводит имя и возраст.
//Программа отображает сообщение об имени и возрасте пользователя.

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите возраст: ");
        int age = in.nextInt();

        System.out.printf("Ваше имя: %s, возраст: %d \n", name, age);
        in.close();
    }
}

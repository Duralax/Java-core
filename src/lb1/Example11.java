package lb1;

import java.util.Scanner;

//Задача 6
//Напишите программу, в которой Пользователь вводит имя и год рождения, в
//программа отображает сообщение содержащее имя пользователя и его возраст.

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int current_date = 2025;

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите год рождения: ");
        int year_birth = in.nextInt();

        int age = current_date - year_birth;

        System.out.printf("%s, ваш возраст: %d \n", name, age);
        in.close();
    }
}

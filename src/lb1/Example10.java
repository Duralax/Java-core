package lb1;

import java.util.Scanner;

//Задача 5
//Напишите программу, в которой по году рождения определяется возраст пользователя.

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int current_year = 2025;

        System.out.println("Введите свой год рождения: ");
        int birth_year = in.nextInt();

        int age = current_year - birth_year;

        System.out.printf("Вам %d (2025 - %d) \n", age, birth_year);
        in.close();
    }
}

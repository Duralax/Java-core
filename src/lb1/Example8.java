package lb1;

import java.util.Scanner;

//Задача 3
// Напишите программу, в которой Пользователь последовательно вводит
//название текущего дня недели, название месяца и дату (номер дня в месяце).
//Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название текущего дня недели: ");
        String day_name = in.nextLine();

        System.out.println("Введите название месяца: ");
        String month_name = in.nextLine();

        System.out.println("Введите дату(номер дня в месяце): ");
        int date = in.nextInt();

        System.out.printf("Сегодняшняя дата: %s %d %s \n", day_name, date, month_name);
        in.close();
    }
}

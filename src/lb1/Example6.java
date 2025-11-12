package lb1;

import java.util.Scanner;

//Задача 1
//Напишите программу, в которой Пользователь вводит сначала фамилию,
//затем имя, затем отчество. После ввода программа выводит сообщение «Hello <фамилия, имя, отчество>».

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Enter your surname: ");
        String surname = in.nextLine();

        System.out.println("Enter your patrynomic: ");
        String patrynomic = in.nextLine();

        System.out.printf("Hello %s %s %s! \n", surname, name, patrynomic);
        in.close();
    }
}

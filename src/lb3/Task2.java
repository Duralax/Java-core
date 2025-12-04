package lb3;

import java.util.Scanner;

//2. Напишите программу, в которой пользователю предлагается ввести название дня недели.
// По введенному названию программа определяет порядковый номер дня в неделе.
// Если пользователь вводит неправильное название дня, программа выводит сообщение о том, что такого дня нет.
// Предложите версию программы на основе вложенных условных операторов и на основе оператора выбора switch.

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели: ");
        String day_name = in.nextLine();

        // Вложенные условные операторы
        System.out.println("Способ с вложенными условными операторами:");
        if (day_name.equals("Понедельник")){
            System.out.println(1);
        } else if (day_name.equals("Вторник")) {
            System.out.println(2);
        } else if (day_name.equals("Среда")) {
            System.out.println(3);
        } else if (day_name.equals("Четверг")) {
            System.out.println(4);
        } else if (day_name.equals("Пятница")) {
            System.out.println(5);
        } else if (day_name.equals("Суббота")) {
            System.out.println(6);
        } else if (day_name.equals("Воскресенье")) {
            System.out.println(7);
        } else {
            System.out.println("Такого дня нет");
        }

        System.out.println("Способ с использованием switch: ");
        switch (day_name){
            case "Понедельник":
                System.out.println(1);
                break;
            case "Вторник":
                System.out.println(2);
                break;
            case "Среда":
                System.out.println(3);
                break;
            case "Четверг":
                System.out.println(4);
                break;
            case "Пятница":
                System.out.println(5);
                break;
            case "Суббота":
                System.out.println(6);
                break;
            case "Воскресенье":
                System.out.println(7);
                break;
            default:
                System.out.println("Такого дня нет");
                break;
        }

        in.close();
    }
}

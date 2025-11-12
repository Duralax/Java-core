package lb1;

import java.util.Scanner;

//Задача 4
//Напишите программу, в которой пользователю предлагается ввести
//название месяца и количество дней в этом месяце. Программа выводит
//сообщение о том, что соответствующий месяц содержит указанное количество дней.

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите навзание месяца: ");
        String month_name = in.nextLine();

        System.out.println("Введите кол-во дней в месяце: ");
        int days_amount = in.nextInt();

        System.out.printf("Месяц: %s, содержит %d дней! \n", month_name, days_amount);
        in.close();
    }
}

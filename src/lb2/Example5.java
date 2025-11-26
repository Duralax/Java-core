package lb2;

import java.util.Scanner;

//Напишите программу, которая проверяет, сколько тысяч во введенном
//пользователем числе (определяется четвертая цифра справа в десятичном
//представлении числа).

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = in.nextInt();

        if (num >= 1000){
            int thous = (num / 1000) % 10;
            System.out.printf("В числе %d, %d тыс. \n", num, thous);
        } else {
            System.out.printf("В числе %d нет тысяч \n", num);
        }

        in.close();
    }
}

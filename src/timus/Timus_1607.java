package timus;

import java.util.Scanner;

// Задача timus 1607
//Этот диалог продолжается до тех пор, пока они не сойдутся в цене. Петя всегда увеличивает свою цену на одну и ту же сумму, а таксист таким же образом снижает ее. Таксист не станет называть цену ниже той, которую предложит Петя. В этом случае он согласится с его ценой. Аналогичным образом поступит и Петя.
//Исходные данные
//В единственной строке даны 4 целых числа: a — стартовая цена Пети, b — надбавка Пети к своей цене, c — стартовая цена таксиста, d — скидка таксиста к своей цене (1 ≤ a, b, c, d ≤ 10000).
//Результат
//Выведите сумму, которую Петя заплатит за проезд.
//Пример
//исходные данные
//150 50 1000 100
//результат
//450

public class Timus_1607 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int petyaPrice = in.nextInt();
        int stepPetya = in.nextInt();
        int taxiPrice = in.nextInt();
        int stepTaxi = in.nextInt();

        int finalPrice = 0;

        if (petyaPrice >= taxiPrice){
            finalPrice = petyaPrice;
        } else {
            while (true){
                petyaPrice += stepPetya;

                if (petyaPrice >= taxiPrice){
                    finalPrice = taxiPrice;
                    break;
                }

                taxiPrice -= stepTaxi;

                if (taxiPrice <= petyaPrice){
                    finalPrice = petyaPrice;
                    break;
                }

            }
        }

        System.out.println(finalPrice);
    }
}

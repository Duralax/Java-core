package timus;

import java.util.Scanner;

public class Task_1644 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int minSatisfied = 10;
        int maxHungry = 2;

        for (int i = 0; i < n; i++){
            int amount = sc.nextInt();
            String status = sc.next();
            
            if (status.equals("hungry") && amount > maxHungry){
                maxHungry = amount;
            } else if (status.equals("satisfied") && amount < minSatisfied) {
                minSatisfied = amount;
            }
        }

        if (maxHungry >= minSatisfied){
            System.out.println("Inconsistent");
        }else {
            System.out.println(minSatisfied);
        }
        sc.close();
    }
}

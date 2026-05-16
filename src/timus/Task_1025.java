package timus;

import java.util.Scanner;

public class Task_1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();

        int amountGroupsToWin = amount / 2 + 1;
        int result = 0;
        int[] groups = new int[amount];

        for (int i = 0; i < amount; i++){
            groups[i] = sc.nextInt();
        }

        for (int i = 0; i < groups.length - 1; i++){
            for (int j = 0; j < groups.length - 1 - i; j++){
                if (groups[j] > groups[j + 1]){
                    int temp = groups[j];
                    groups[j] = groups[j + 1];
                    groups[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < amountGroupsToWin; i++){
            result += groups[i] / 2 + 1;
        }
        System.out.println(result);
        sc.close();
    }
}

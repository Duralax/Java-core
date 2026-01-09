package timus;

import java.util.Arrays;
import java.util.Scanner;

public class Timus_1510 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int amount = in.nextInt();

        int[] all_values = new int[amount];

        for (int i = 0; i < amount; i++){
            all_values[i] = in.nextInt();
        }

        Arrays.sort(all_values);

        System.out.println(all_values[amount/2]);

    }
}

package timus;

import java.util.Scanner;

public class Timus_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int amount = in.nextInt();

        if ((12 - amount) * 45 <= 240){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}

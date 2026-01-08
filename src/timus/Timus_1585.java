package timus;

import java.util.Scanner;

public class Timus_1585 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int amount = in.nextInt();
        in.nextLine();

        int macaroni = 0;
        int emperor = 0;
        int little = 0;

        for (int i = 0; i < amount; i++) {
            String penguin = in.nextLine();

            if (penguin.equals("Emperor Penguin")) {
                emperor++;
            } else if (penguin.equals("Little Penguin")) {
                little++;
            } else if (penguin.equals("Macaroni Penguin")) {
                macaroni++;
            }
        }
        int max_amount = emperor;
        if (little > max_amount) {
            max_amount = little;
        }
        if (macaroni > max_amount) {
            max_amount = macaroni;
        }
        if (max_amount == emperor) {
            System.out.println("Emperor Penguin");
        } else if (max_amount == little) {
            System.out.println("Little Penguin");
        } else {
            System.out.println("Macaroni Penguin");
        }
    }
}
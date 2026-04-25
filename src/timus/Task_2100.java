package timus;

import java.util.Scanner;

public class Task_2100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int guests = 2;

        int amount = in.nextInt();

        for (int i = 0; i < amount; i++){
            String guest = in.next();

            if (guest.contains("+one")){
                guests += 2;
            } else {
                guests += 1;
            }
        }
        if (guests == 13){
            guests += 1;
        }
        System.out.println(guests * 100);
    }
}

package timus;

import java.util.Scanner;

public class Timus_1493 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        int next_num = number + 1;
        int previous_num = number - 1;

        if (luckyTicket(next_num) || luckyTicket(previous_num)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
    static boolean luckyTicket(int num){
        int left_side = num / 1000;

        int right_side = num % 1000;

        int left_side_sum = 0;
        int right_side_sum = 0;

        while (left_side > 0){
            left_side_sum += left_side % 10;
            left_side = left_side / 10;
        }
        while (right_side > 0){
            right_side_sum += right_side % 10;
            right_side = right_side / 10;
        }
        return left_side_sum == right_side_sum;
    }

}

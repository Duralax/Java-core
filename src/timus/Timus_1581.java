package timus;

import java.util.Scanner;

public class Timus_1581 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int amount = in.nextInt();

        int[] numsArray = new int[amount];

        String resultSequence = "";

        for (int i = 0; i < amount; i ++){
            numsArray[i] = in.nextInt();
        }

        int sumOfCurrentNum = 1;

        for (int i = 0; i < numsArray.length; i ++){
            if(i < numsArray.length-1 && numsArray[i] == numsArray[i+1]){
                sumOfCurrentNum += 1;

            } else {
                resultSequence += sumOfCurrentNum + " " + numsArray[i] + " ";
                sumOfCurrentNum = 1;
            }

        }
        System.out.println(resultSequence);
        in.close();

    }
}

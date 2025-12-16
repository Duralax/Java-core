package timus;

import java.util.Scanner;

public class Timus_1567 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] keyboard = {"abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz", ".,!"};

        int textPrice = 0;

        String advertText = in.nextLine();

        char[] advertTextArray = advertText.toCharArray();

        for (int i = 0; i < advertTextArray.length; i++){
            if (advertTextArray[i] == ' ') {
                textPrice += 1;
            } else {
                for (int j = 0; j < keyboard.length; j ++){
                    if (keyboard[j].indexOf(advertTextArray[i]) != -1) {
                        textPrice = textPrice + keyboard[j].indexOf(advertTextArray[i]) + 1;
                    }
                }
            }
        }

        System.out.println(textPrice);
        in.close();
    }
}

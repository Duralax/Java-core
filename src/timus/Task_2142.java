package timus;

import java.util.Scanner;

public class Task_2142 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long red = in.nextInt();
        long blue = in.nextInt();
        long redAndBlue = in.nextInt();

        long redMana = in.nextInt();
        long blueMana = in.nextInt();
        long anyMana = in.nextInt();

        if (red + blue + redAndBlue < redMana + blueMana + anyMana){
            System.out.println("There are no miracles in life");
            return;
        }

        long needBlue, needRed;

        if (red < redMana){
            needRed = redMana - red;
        } else {
            needRed = 0;
        }

        if (blue < blueMana){
            needBlue = blueMana - blue;
        } else {
            needBlue = 0;
        }

        if (needRed + needBlue > redAndBlue) {
            System.out.println("There are no miracles in life");
            return;
        }

        long remainRedAndBlue = redAndBlue - needBlue - needRed;
        long remainRed = red + needRed - redMana;
        long remainBlue = blue + needBlue - blueMana;

        if (remainRedAndBlue + remainRed + remainBlue >= anyMana){
            System.out.println("It is a kind of magic");
        } else {
            System.out.println("There are no miracles in life");
        }

    }
}

package timus;

import java.util.Scanner;

public class Timus_1563 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int amountOfAllShops = in.nextInt();

        String[] allShops = new String[amountOfAllShops];
        String[] visitedShop = new String[amountOfAllShops];

        in.nextLine();

        for (int i = 0; i < allShops.length; i++){
            allShops[i] = in.nextLine();
        }

        int bayanCounter = 0;
        int visitedShopsIndex = 0;

        for (int shop = 0; shop < allShops.length; shop++){
            boolean notUniqueShop = false;

            for (int compare = 0; compare < visitedShopsIndex; compare++){

                if (allShops[shop].equals(visitedShop[compare])){
                    bayanCounter++;
                    notUniqueShop = true;
                    break;
                }
            }

            if (!notUniqueShop){
                visitedShop[visitedShopsIndex] = allShops[shop];
                visitedShopsIndex++;
            }

        }

        System.out.println(bayanCounter);
        in.close();
    }

}

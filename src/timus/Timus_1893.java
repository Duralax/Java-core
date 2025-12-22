package timus;

import java.util.Scanner;

public class Timus_1893 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String place = in.next();

        char[] placeChars = place.toCharArray();

        char placeLetter = place.charAt(place.length()-1);

        String strNumPlace = "";

        for (int i = 0; i < placeChars.length-1; i++){
            strNumPlace += placeChars[i];
        }

        int numPlaces = Integer.parseInt(strNumPlace);

        String result = "";

        if (numPlaces >= 21){
            if (placeLetter == 'C' || placeLetter == 'D' || placeLetter == 'G' || placeLetter == 'H'){
                result = "aisle";
            } else if (placeLetter == 'A' || placeLetter == 'K') {
                result = "window";
            } else {
                result = "neither";
            }
        } else if (numPlaces >= 3 && numPlaces <= 20) {
            if (placeLetter == 'C' || placeLetter == 'B' || placeLetter == 'D' || placeLetter == 'E'){
                result = "aisle";
            } else if (placeLetter == 'A' || placeLetter == 'F') {
                result = "window";
            } else {
                result = "neither";
            }
            
        } else if (numPlaces < 3) {
            if (placeLetter == 'B' || placeLetter == 'C'){
                result = "aisle";
            } else if (placeLetter == 'A' || placeLetter == 'D') {
                result = "window";
            }
        }
        
        System.out.println(result);
    }
}

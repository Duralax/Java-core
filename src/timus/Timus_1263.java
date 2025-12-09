package timus;

import java.util.Scanner;

public class Timus_1263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int candidats = in.nextInt();
        int electors = in.nextInt();

        int [] allVoices = new int[electors];

        for (int i = 0; i < allVoices.length; i++){
            allVoices[i] = in.nextInt();
        }

        double voicesPercent;

        for (int candidat = 1; candidat <= candidats; candidat++){
            int candidat_voices = 0;
            for (int voice = 0; voice < allVoices.length; voice++){
                if (candidat == allVoices[voice]){
                    candidat_voices++;
                }
            }
            voicesPercent = ((double) candidat_voices / electors) * 100;
            System.out.printf("%.2f%%\n", voicesPercent);

        }
    }
}

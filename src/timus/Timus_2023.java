package timus;

import java.util.Scanner;

public class Timus_2023 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int steps = 0;
        int currentBox = 1;

        String[] mailbox1 = {"Alice", "Ariel", "Aurora", "Phil", "Peter", "Olaf", "Phoebus", "Ralph", "Robin"};
        String[] mailbox2 = {"Bambi", "Belle", "Bolt", "Mulan", "Mowgli", "Mickey", "Silver", "Simba", "Stitch"};
        String[] mailbox3 = {"Dumbo", "Genie", "Jiminy", "Kuzko", "Kida", "Kenai", "Tarzan", "Tiana", "Winnie"};

        int amount = in.nextInt();

        String[] envelopes = new String[amount];

        for (int i = 0; i < amount; i++){
            envelopes[i] = in.next();
        }

        for (int j = 0; j < envelopes.length; j++){
            int targetBox = currentBox;
            for (int m = 0; m < mailbox1.length; m++){
                if (mailbox1[m].equals(envelopes[j])){
                    targetBox = 1;
                    break;
                }

                if (mailbox2[m].equals(envelopes[j])){
                    targetBox = 2;
                    break;
                }

                if (mailbox3[m].equals(envelopes[j])){
                    targetBox = 3;
                    break;
                }
            }
            steps += Math.abs(targetBox - currentBox);
            currentBox = targetBox;
        }

        System.out.println(steps);
        in.close();
    }
}

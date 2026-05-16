package timus;

import java.util.Scanner;

public class Task_1910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int maxSum = 0;
        int centralPos = 0;

        for (int i = 0; i < n - 2; i++){
            int sum = nums[i] + nums[i + 1] + nums[i +2];
            if (sum > maxSum){
                maxSum = sum;
                centralPos = i + 1 +1;
            }
        }
        System.out.println(maxSum + " " + centralPos);
        sc.close();
    }
}

package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task_1196 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        Set<Integer> teacherDates = new HashSet<>();

        for (int i = 0; i < N; i++){
            teacherDates.add(Integer.parseInt(reader.readLine()));
        }

        int M = Integer.parseInt(reader.readLine());
        int counter = 0;

        for (int i = 0; i < M; i++){
            int studentDate = Integer.parseInt(reader.readLine());
            if (teacherDates.contains(studentDate)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}

package lb9.Task7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task7Compare {
    public static void forArrayList(int num){
        long start = System.currentTimeMillis();

        List<Integer> peopleInCircle = new ArrayList<>();
        for (int i = 1; i <= num; i++){
            peopleInCircle.add(i);
        }
        int currentPersonIndex = 0;

        while (peopleInCircle.size() > 1){

            currentPersonIndex = currentPersonIndex + 1;

            if (currentPersonIndex >= peopleInCircle.size()){
                currentPersonIndex = 0;
            }

            peopleInCircle.remove(currentPersonIndex);
        }

        long end = System.currentTimeMillis();

        long workTime = end - start;

        System.out.println("Время работы ArrayList: " + workTime + "мс");
    }

    public static void forLinkedList(int num){
        long start = System.currentTimeMillis();

        List<Integer> peopleInCircle = new LinkedList<>();
        for (int i = 1; i <= num; i++){
            peopleInCircle.add(i);
        }
        int currentPersonIndex = 0;

        while (peopleInCircle.size() > 1){

            currentPersonIndex = currentPersonIndex + 1;

            if (currentPersonIndex >= peopleInCircle.size()){
                currentPersonIndex = 0;
            }

            peopleInCircle.remove(currentPersonIndex);
        }
        long end = System.currentTimeMillis();

        long workTime = end - start;

        System.out.println("Время работы LinkedList: " + workTime + "мс");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество людей в кругу:");
        int num = sc.nextInt();

        forArrayList(num);
        forLinkedList(num);

    }
}

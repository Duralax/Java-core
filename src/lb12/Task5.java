package lb12;

import java.util.Random;

//Напишите функцию, которая находит максимальный элемент в массиве целых чисел при помощи многопоточности.
// Количество потоков должно быть равно количеству ядер процессора

public class Task5 {

    private static int maxNum = Integer.MIN_VALUE;
    private static final Object lock = new Object();

    public static void main(String[] args) {

        Random random = new Random();

        int size = 32;
        System.out.println("Массив: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.println("\nМаксимальное значение в массиве: " + findMaxInArr(array));

    }

    private static int findMaxInArr(int[] array){
        int threadsNum = 16;
        Thread[] threads = new Thread[threadsNum];

        int sizeForThread = array.length/threadsNum;

        int start = 0;
        for (int i = 0; i < threadsNum; i++){
            int end;
            if (i == threadsNum-1){
                end = array.length ;
            } else {
                end = start + sizeForThread;
            }

            int finalStart = start;
            threads[i] = new Thread(()->{
                int localMax = array[finalStart];
                for (int j = finalStart + 1; j < end; j++){
                    if (array[j] > localMax){
                        localMax = array[j];
                    }
                }
                synchronized (lock){
                    if (localMax > maxNum){
                        maxNum = localMax;
                    }
                }
            });

            start = end;
            threads[i].start();
        }
        try {
            for (Thread t : threads){
                t.join();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return maxNum;
    }
}

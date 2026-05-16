package lb12;

// Напишите функцию, которая суммирует элементы в массиве целых чисел при помощи многопоточности.
// Количество потоков должно быть равно количеству ядер процессора.

import java.util.Random;

public class Task6 {

    private static int sumNums = 0;
    private static final Object lock = new Object();

    public static void main(String[] args) {

        Random random = new Random();

        int size = 32;
        int [] array = new int[size];

        System.out.println("Массив: ");
        for (int i = 0; i < size; i++){
            array[i] = random.nextInt(100);
            System.out.print(array[i] +  " ");
        }

        System.out.println("\nСумма элементов массива: " + sumOfArrayElems(array));

    }

    private static int sumOfArrayElems(int[] array){
        int threadsNum = 16;

        Thread[] threads = new Thread[threadsNum];
        int sizeForThread = array.length/threadsNum;
        int start = 0;

        for (int i = 0; i < threadsNum; i++){
            int end;
            if (i == threadsNum - 1){
                end = array.length;
            }else {
                end = start + sizeForThread;
            }
            int finalStart = start;

            threads[i] = new Thread(() -> {
                int localSum = 0;
                for (int n = finalStart; n < end; n++){
                    localSum += array[n];
                }
                synchronized (lock){
                    sumNums += localSum;
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
        return sumNums;
    }

}

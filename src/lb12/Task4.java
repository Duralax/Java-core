package lb12;

//Напишите программу, которая создает 10 потоков и каждый поток выводит на экран свой номер.

public class Task4 {
    public static void main(String[] args) throws InterruptedException {

        Thread[] threads = new Thread[10];

        for (int i = 1; i <= 10; i++){
            int threadNum = i;
            threads[i-1] = new Thread(() -> {
                System.out.println("Номер потока: " + threadNum);
            });

            threads[i-1].start();
        }

        for (Thread t : threads){
            t.join();
        }

    }
}

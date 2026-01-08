package lb8.example5;

import java.io.*;
import java.util.Scanner;

public class Example5Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя файла => ");
        String fname = "F:\\IdeaProjects\\java-core_2025-2026\\src\\lb8\\example5\\" + sc.nextLine() + ".txt";
        try {
            // Создается файл
            File f1 = new File(fname);
            f1.createNewFile(); // файл создан
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());
            System.out.println("Введите кол-во строк для записи в файл => ");
            int n = sc.nextInt();
            //Созданется поток данных для записи с учетом типа данных - DataOutputStream, и ему в качестве параметра передается поток FileOutputStream
            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine(); // очистка буфера
            for (int i = 0; i < n; i++){
                System.out.println("Введите строку для записи в файл => ");
                String s = sc.nextLine();
                dOut.writeUTF(s); // или dOut.writeUTF(s+"\n");
            }
            dOut.flush(); // дописываем несохраненные данные на диск
            dOut.close(); // закрытие потока
            // Чтение и вывод данных из созданного файла
            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            while (true){
                System.out.println(dIn.readUTF());
            }
        }catch (Exception e){
            System.out.println(""+e);
        }
    }
}

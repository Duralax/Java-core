package lb8.example4;

import java.io.*;
import java.util.Scanner;

public class Example4Class {
    public static void main(String[] args) {
        try {
            File f1 = new File("F:\\IdeaProjects\\java-core_2025-2026\\src\\lb8\\example4\\numIsh.txt");
            f1.createNewFile();

            Scanner sc = new Scanner(System.in, "cp1251");

            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsoluteFile()));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();

            System.out.println("Введите числа: ");
            for (int i = 0; i < count; i++){
                wr.writeFloat(sc.nextFloat());
            }
            wr.flush();
            wr.close();

            //Создание файла numRez.txt и переписываание в него чисел из numIsh.txt
            File f2 = new File("F:\\IdeaProjects\\java-core_2025-2026\\src\\lb8\\example4\\numRez.txt");
            f2.createNewFile();
            // Поток для чтения из исходного файла numIsh.txt
            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsoluteFile()));
            // поток для записи в результатирующий файл numRez.txt
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsoluteFile()));

            try {
                while (true){
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println("Число " + (float)number);
                }
            }catch (EOFException e){
            }
            wr.flush();
            wr.close();
            rd.close();

        } catch (Exception e) {
            System.out.println("End of file");
        }

    }
}

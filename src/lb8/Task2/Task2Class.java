package lb8.Task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2Class {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            File f1 = new File("F:\\IdeaProjects\\java-core_2025-2026\\src\\lb8\\Task2\\File1.txt");
            f1.createNewFile();
            System.out.println("Полный путь до созданного файла: ");
            System.out.println(f1.getAbsolutePath());

            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f1), StandardCharsets.UTF_8));
            System.out.println("Введите две строки для записи в файл: ");
            for (int i = 0; i < 2; i++){
                System.out.print("Строка для записи => ");
                String s = sc.nextLine();
                bw.write(s);
                bw.newLine();
            }

            System.out.println("Введите 5 чисел типа double для записи в файл: ");
            for (int i = 0; i < 5; i++) {
                while (true){
                    try{
                        System.out.print("Введите число " + (i+1) + " => ");
                        double num = sc.nextDouble();
                        bw.write(String.valueOf(num));
                        bw.newLine();
                        break;
                    }catch (InputMismatchException e){
                        System.out.println("Введено некорректное число");
                        sc.next();
                    }
                }
            }
            bw.flush();
            bw.close();

            File f2 = new File("F:\\IdeaProjects\\java-core_2025-2026\\src\\lb8\\Task2\\ResultFile.txt");
            f2.createNewFile();
            br = new BufferedReader(new InputStreamReader(new FileInputStream(f1)));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f2)));

            int lineCount = 0;
            String line;
            System.out.println("Записанные строки: ");
            while ((line = br.readLine()) != null){
                lineCount++;

                if (lineCount == 2) {
                    bw.write(line);
                    System.out.println(line);
                    bw.newLine();

                } else if (lineCount > 2) {
                    double line_num = Double.parseDouble(line);
                    if (line_num > 0){
                        bw.write(line);
                        System.out.println(line);
                        bw.newLine();
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Ошибка!" + e);
        }finally {
            bw.flush();
            bw.close();
            br.close();
        }
    }
}

package lb8.example6;

import java.io.*;

public class Example6Class {
    public static void main(String[] args) throws IOException { // генерация исключения
        Reader in = null;  // можно сразу записать FileReader in = null;
        Writer out = null; // можно сразу FileWriter out = null;
        try {
            in = new FileReader("F:\\IdeaProjects\\java-core_2025-2026\\src\\lb8\\example6\\MyFile1.txt");
            out = new FileWriter("F:\\IdeaProjects\\java-core_2025-2026\\src\\lb8\\example6\\MyFile2.txt", true);
            // Данные считываются и записываются побайтно, как и для InputStream/OutputStream
            int oneByte; // переменная, в которую считываются данные
            while ((oneByte = in.read())!=-1){
                out.append((char) oneByte); //out.write((char)oneByte);
                System.out.println((char)oneByte);
            }
        }catch (IOException e){
            System.out.println("Ошибка!!! ");
        }finally {
            in.close();
            out.close();
        }
    }
}

package lb8.example8;

import java.io.*;
import java.net.URL;

public class Example8Class {
    public static void readAllByByte(Reader in) throws IOException{
        while (true){
            int oneByte = in.read(); //читает 1 байт
            if (oneByte != -1){      //признак конца файла
                System.out.println((char) oneByte);
            }else {
                System.out.println("\n" + "конец");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try{
            //С потоком связан файл
            InputStream inFile = new FileInputStream("F:\\IdeaProjects\\java-core_2025-2026\\src\\lb8\\example8\\MyFile1.txt"); // байтовый поток

            Reader rFile = new InputStreamReader(inFile, "cp1251"); // символьный поток cp1251 - русская кодировка

            readAllByByte(rFile);
            System.out.println("\n\n\n");
            inFile.close();
            rFile.close();

            // С потоком связана интернет-страница
            InputStream inUrl = new URL("http://google.com").openStream();    // байтовый поток

            Reader rUrl = new InputStreamReader(inUrl, "cp1251"); // символьный поток

            readAllByByte(rUrl);
            System.out.println("\n\n\n");
            inUrl.close();
            rUrl.close();

            // С потоком связан массив типа byte
            InputStream inArray = new ByteArrayInputStream(new byte[] {5, 8, 3, 9, 11});
            Reader rArray = new InputStreamReader(inArray, "cp1251"); // символьный поток

            readAllByByte(rArray);
            System.out.println("\n\n\n");
            inArray.close();
            rArray.close();
        }catch (IOException e){
            System.out.println("Ошибка: " + e);
        }
    }
}

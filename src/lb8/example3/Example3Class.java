package lb8.example3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Example3Class {
    public static void readAllByArray(InputStream in) throws IOException{
        byte [] buff = new byte[5];
        while (true){
            int count = in.read(buff);
            if (count != -1){ // Если не конец файла
                System.out.println("количество = " + count + ", buff = " + Arrays.toString(buff) + ", str = " + new String(buff, 0, count, "cp1251")); //UTF8
            }else {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        String fileName = "F:\\IdeaProjects\\java-core_2025-2026\\src\\lb8\\example3\\textFor3.txt";
        InputStream inFile = null; // объявление до секции try, чтобы не ограничивать область видимости

        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e){
            System.out.println("Ошибка открытия-закрытия файла " + fileName + e);
        } finally { // корректное закрытие потока
            if (inFile != null){
                try {
                    inFile.close();
                } catch (IOException ignore){
                    /*NOP*/ //"No OPeration" - ничего не делать
                }
            }
        }
    }
}

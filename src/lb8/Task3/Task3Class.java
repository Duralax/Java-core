package lb8.Task3;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Task3Class {

    static boolean isConsonantsStarts(String str){

        if (str.isEmpty()){
            return false;
        }

        String consonants = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ";
        if (consonants.indexOf(str.charAt(0)) != -1){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        //PrintWriter out = null;

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("F:\\IdeaProjects\\java-core_2025-2026\\src\\lb8\\Task3\\text.txt"), StandardCharsets.UTF_8));
            File resultFile = new File("F:\\IdeaProjects\\java-core_2025-2026\\src\\lb8\\Task3\\resultFile.txt");
            resultFile.createNewFile();
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(resultFile), StandardCharsets.UTF_8));
            //out = new PrintWriter(resultFile, "UTF-8");
            int lineCount = 0;
            String line;
            System.out.println("Записанные строки: ");

            while ((line = br.readLine()) != null){
                lineCount++;
                if (!line.isEmpty()){
                    String newLine = "";
                    int wordsInLineAmount = 0;
                    String[] wordsInLine = line.split("[ ,!;:.-]+");
                    for (String str : wordsInLine){
                        if (isConsonantsStarts(str)){
                            wordsInLineAmount++;
                            newLine += str + " ";
                        }
                    }
                    System.out.println(lineCount + " " + wordsInLineAmount + " " + newLine);
                    //out.println(lineCount + " " + wordsInLineAmount + " " + newLine);
                    bw.write(lineCount + " " + wordsInLineAmount + " " + newLine);
                    bw.newLine();
                }
            }
        } catch (Exception e){
            System.out.println("Ошибка! " + e);
        }finally {
            br.close();
            bw.flush();
            bw.close();
            //out.flush();
            //out.close();
        }
    }
}

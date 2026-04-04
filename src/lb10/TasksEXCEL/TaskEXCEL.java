package lb10.TasksEXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class TaskEXCEL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean out = false;
        while (!out) {
            try {

                System.out.print("\nВведите путь к файлу .xlsx: ");
                String filePath = sc.nextLine();

                if (!filePath.endsWith(".xlsx")) {
                    System.out.println("Неверный формат файла! Файл должен быть с расширением .xlsx");
                    continue;
                }

                FileInputStream inputStream;
                try {
                    inputStream = new FileInputStream(filePath);
                } catch (FileNotFoundException e){
                    System.out.println("Путь к файлу: " + filePath + ", указан неверно или данного файла не существует по данному пути");
                    continue;
                }

                XSSFWorkbook workbook;
                try {
                    workbook = new XSSFWorkbook(inputStream);
                } catch (Exception e) {
                    System.out.println("Невозможно открыть файл: " + filePath + ", возможно файл поврежден");
                    inputStream.close();
                    continue;
                }

                System.out.print("Введите название листа: ");
                String sheetName = sc.nextLine();

                XSSFSheet sheet = workbook.getSheet(sheetName);

                if (sheet == null){
                    System.out.println("Листа: \"" + sheetName + "\" не существует");
                    System.out.println("Доступные листы в файле:");
                    for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                        System.out.println(workbook.getSheetName(i) + "; ");
                    }

                    workbook.close();
                    inputStream.close();
                    continue;
                }

                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.println(cell.toString() + "\t");
                    }
                    System.out.println();
                }
                System.out.println("Файл: " + filePath + ", прочитан!");

                workbook.close();
                inputStream.close();

                out = true;

            } catch (IOException e) {

                System.out.println("Непредвиденная ошибка! " + e.getMessage());

            }
        }
    }
}

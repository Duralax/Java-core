package lb10.TasksJSON;

import java.io.FileWriter;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.Iterator;
import java.util.Scanner;


public class TaskJSON {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String filePath = "src/lb10/TasksJSON/movies.json";

        try{
            int choice = -1;
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(filePath));
            JSONObject jsonObject = (JSONObject) obj;
            while (true){

                if (choice == -1){
                    System.out.println("\nВыбор действия с JSON файлом:");
                    System.out.println("1) Вывести содержимое файла");
                    System.out.println("2) Поиск фильма по режиссеру");
                    System.out.println("3) Добавить фильм");
                    System.out.println("4) Удаление элемента по названию фильма");
                    System.out.println("5) Выход");
                    System.out.print("-> ");
                    choice = sc.nextInt();
                    sc.nextLine();
                }
                if (choice == 1){
                    choice = -1;

                    System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());

                    JSONArray jsonArray = (JSONArray) jsonObject.get("movies");

                    for (Object o : jsonArray){
                        JSONObject book = (JSONObject) o;
                        System.out.println("\nТекущий элемент: movie");
                        System.out.println("Название фильма: " + book.get("title"));
                        System.out.println("Режиссёр: " + book.get("director"));
                        System.out.println("Год создания: " + book.get("year"));
                    }
                } else if (choice == 2) {
                    System.out.println("\nПоиск фильма");
                    System.out.println("Введите режиссёра для поиска:");
                    String searchDirector = sc.nextLine();

                    JSONArray moviesArray = (JSONArray) jsonObject.get("movies");

                    System.out.println("\nРезультаты поиска (по режиссеру: " + searchDirector + "):");
                    boolean found = false;

                    for (Object o : moviesArray) {
                        JSONObject movie = (JSONObject) o;
                        String director = (String) movie.get("director");
                        if (director.equalsIgnoreCase(searchDirector)) {
                            System.out.println("Название: " + movie.get("title") +
                                    ", Режиссёр: " + movie.get("director") +
                                    ", Год: " + movie.get("year"));
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Ничего не найдено");
                    }
                    choice = -1;
                } else if (choice == 3) {
                    System.out.println("Добавление фильма");

                    System.out.println("Введите название добавляемого фильма:");
                    String newTitle = sc.nextLine();
                    System.out.print("Введите режиссёра: ");
                    String newDirector = sc.nextLine();
                    System.out.print("Введите год: ");
                    String newYear = sc.nextLine();

                    JSONArray jsonArray = (JSONArray) jsonObject.get("movies");

                    JSONObject newMovie = new JSONObject();
                    newMovie.put("title", newTitle);
                    newMovie.put("director", newDirector);
                    newMovie.put("year", newYear);

                    jsonArray.add(newMovie);

                    FileWriter file = new FileWriter(filePath);
                    file.write(jsonObject.toJSONString());
                    file.close();
                    choice = 1;

                } else if (choice == 4) {
                    System.out.println("\nУдаление по названию фильма");
                    System.out.println("Введите название фильма для удаления: ");
                    String deleteTitle = sc.nextLine();

                    JSONArray moviesArray = (JSONArray) jsonObject.get("movies");
                    boolean deletedCheck = false;

                    Iterator iterator = moviesArray.iterator();
                    while (iterator.hasNext()) {
                        JSONObject movie = (JSONObject) iterator.next();
                        String title = (String) movie.get("title");
                        if (title.equals(deleteTitle)) {
                            iterator.remove();
                            deletedCheck = true;
                            System.out.println("Фильм " + deleteTitle + " удален");
                            break;
                        }
                    } if (deletedCheck){
                        FileWriter writer = new FileWriter(filePath);
                        writer.write(jsonObject.toJSONString());
                        writer.close();

                    } else {
                        System.out.println("Фильма " + deleteTitle + " нет");
                    }

                    choice = 1;
                } else if (choice == 5) {
                    break;
                } else {
                    choice = -1;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

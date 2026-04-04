package lb10.TasksHTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TaskHTML {
    public static void main(String[] args) {
        String url = "https://www.e1.ru/text/";
        String filePath = "src/lb10/TasksHTML/newsInfo.txt";
        for (int at = 1; at <= 5; at++){
            try {
                System.out.println("Попытка подключения " + at);
                Document doc = Jsoup.connect(url).timeout(2000).get();
                System.out.println("Успешное подключение");

                Elements newsItems = doc.select(".wrap_RL97A");

                //Element anewsItems = doc.selectFirst(".announcementList_6xAkH");
                //System.out.println(anewsItems);

                PrintWriter writer = new PrintWriter(new FileWriter(filePath));

                int counter = 0;

                for (Element item : newsItems){
                    if (counter == 10){
                        break;
                    }
                    counter++;
                    String date = item.select(".text_FqVl7").get(0).text();
                    String title = item.select(".header_RL97A").text();
                    if (!date.isEmpty() && !title.isEmpty()) {

                        System.out.println("\nТема: " + title);
                        System.out.println("Дата: " + date );

                        writer.println("Тема: " + title);
                        writer.println("Дата: " + date );
                        writer.println();

                    }
                }
                writer.close();
                System.out.println("Данные сохранены в файл: " + filePath);
                break;
            } catch (IOException e) {
                System.out.println("Ошибка при подключении, на попытке " + at);
                e.printStackTrace();
                if (at == 5){
                    System.out.println("Не удалось подключиться спустя " + at + " попыток");
                }
            }
        }

    }
}

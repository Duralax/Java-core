package lb10.TasksXML;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

// Вариант 9 - фильмы

public class TaskXML {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File inputFile = new File("src/lb10/TasksXML/movies.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            Transformer transformer = TransformerFactory.newInstance().newTransformer();

            int choice = -1;

            while(true) {
                if (choice == -1){
                    System.out.println("\nВыбор действия с XML файлом:");
                    System.out.println("1) Вывести содержимое файла");
                    System.out.println("2) Добавить фильм");
                    System.out.println("3) Поиск фильма по году или режиссеру");
                    System.out.println("4) Удаление элемента по названию фильма");
                    System.out.println("5) Выход");

                    System.out.print("-> ");
                    choice = sc.nextInt();
                    sc.nextLine();
                }


                if (choice == 1) {
                    choice = -1;
                    NodeList nodeList = doc.getElementsByTagName("movie");
                    for (int i = 0; i < nodeList.getLength(); i++) {
                        Node node = nodeList.item(i);
                        System.out.println("\nТекущий элемент: " + node.getNodeName());
                        if (node.getNodeType() == Node.ELEMENT_NODE) {
                            Element element = (Element) node;
                            System.out.println("Название фильма: " + element.getElementsByTagName("title").item(0).getTextContent());
                            System.out.println("Режиссер : " + element.getElementsByTagName("director").item(0).getTextContent());
                            System.out.println("Год: " + element.getElementsByTagName("year").item(0).getTextContent());

                        }
                    }
                }

                else if (choice == 2){
                    System.out.println("Добавление фильма");
                    System.out.println("Введите название добавляемого фильма:");
                    String newTitle = sc.nextLine();
                    System.out.print("Введите режиссёра: ");
                    String newDirector = sc.nextLine();
                    System.out.print("Введите год: ");
                    String newYear = sc.nextLine();

                    Element root = doc.getDocumentElement();
                    Element newMovie = doc.createElement("movie");
                    root.appendChild(newMovie);

                    Element title = doc.createElement("title");
                    title.appendChild(doc.createTextNode(newTitle));
                    newMovie.appendChild(title);

                    Element director = doc.createElement("director");
                    director.appendChild(doc.createTextNode(newDirector));
                    newMovie.appendChild(director);

                    Element year = doc.createElement("year");
                    year.appendChild(doc.createTextNode(newYear));
                    newMovie.appendChild(year);


                    DOMSource source = new DOMSource(doc);
                    StreamResult result = new StreamResult(new File("src/lb10/TasksXML/movies.xml"));
                    transformer.transform(source, result);
                    choice = 1;
                }

                else if (choice == 3) {
                    System.out.println("Поиск фильма");
                    System.out.println("Введите что искать (год или режиссер)");
                    String movieSearchParam = sc.nextLine();
                    System.out.println("Введите значение для поиска: ");
                    String movieSearchValue = sc.nextLine();

                    List<Node> list = new ArrayList<>();
                    NodeList nodeList = doc.getElementsByTagName("movie");
                    for (int i = 0; i < nodeList.getLength(); i++) {
                        list.add(nodeList.item(i));
                    }
                    List<Element> movies = list.stream()
                            .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                            .map(node -> (Element) node)
                            .filter(element -> {
                                if (movieSearchParam.equalsIgnoreCase("режиссер")) {
                                    String searchDirector = element.getElementsByTagName("director").item(0).getTextContent();
                                    return searchDirector.equalsIgnoreCase(movieSearchValue);
                                } else if (movieSearchParam.equalsIgnoreCase("год")) {
                                    String searchYear = element.getElementsByTagName("year").item(0).getTextContent();
                                    return searchYear.equals(movieSearchValue);
                                }
                                return false;
                            })
                            .collect(Collectors.toList());
                    System.out.println("\nРезультаты поиска (по " + movieSearchParam + "у: " + movieSearchValue + "):");
                    if (movies.isEmpty()) {
                        System.out.println("Ничего не найдено");
                    } else {
                        for (Element movie : movies) {
                            System.out.println("Название: " + movie.getElementsByTagName("title").item(0).getTextContent() +
                                    ", Режиссёр: " + movie.getElementsByTagName("director").item(0).getTextContent() +
                                    ", Год: " + movie.getElementsByTagName("year").item(0).getTextContent());
                        }
                    }
                    choice = -1;
                }

                else if (choice == 4){
                    System.out.println("\nУдаление по названию фильма");
                    System.out.println("Введите название фильма для удаления: ");
                    String movieNameDelete = sc.nextLine();
                    boolean deletedCheck = false;
                    NodeList nodeList = doc.getElementsByTagName("movie");
                    for (int i = 0; i < nodeList.getLength(); i++) {
                        Node node = nodeList.item(i);
                        if (node.getNodeType() == Node.ELEMENT_NODE) {
                            Element movieElement = (Element) node;
                            String movieName = movieElement.getElementsByTagName("title").item(0).getTextContent();
                            if (movieName.equalsIgnoreCase(movieNameDelete)) {
                                Node parentNode = movieElement.getParentNode();
                                parentNode.removeChild(movieElement);
                                deletedCheck = true;
                                System.out.println("Фильм " + movieNameDelete + " удален");
                                break;
                            }
                        }
                    }
                    if (deletedCheck) {
                        transformer = TransformerFactory.newInstance().newTransformer();
                        DOMSource source = new DOMSource(doc);
                        StreamResult result = new StreamResult(new File("src/lb10/TasksXML/movies.xml"));
                        transformer.transform(source, result);

                    } else {
                        System.out.println("Фильма " + movieNameDelete + "нет");
                    }
                    choice = 1;
                } else if (choice == 5) {
                    break;
                } else {
                  choice = -1;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}

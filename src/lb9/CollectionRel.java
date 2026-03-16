package lb9;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionRel {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Яблоко");
        collection.add("Банан");
        collection.add("Апельсин");

        System.out.println("Содержит Банан? " + collection.contains("Банан"));
        System.out.println("Размер: " + collection.size());

        for (String fruit : collection) {
            System.out.println(fruit);
        }

        collection.remove("Банан");
        System.out.println("После удаления: " + collection);
    }
}


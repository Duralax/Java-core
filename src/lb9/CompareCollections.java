package lb9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.TreeSet;

public class CompareCollections {
    private static final int ELEMENTS_COUNT = 9000000;
    private static final long ITERATIONS_COUNT = 9000000000L;
    private static final int TEST_ITERATIONS = 9000;

    public static void main(String[] args) {
        System.out.println("Количество элементов в коллекциях: " + ELEMENTS_COUNT);
        System.out.println("Количество итераций при добавлении и удалении: " + TEST_ITERATIONS);
        System.out.println("Количество итераций получения по индексу: " + ITERATIONS_COUNT);
        System.out.println("Коллекции: ArrayDeque, ArrayList, TreeSet");
        System.out.println();

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        long startFill = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i);
            arrayDeque.add(i);
            treeSet.add(i);
        }
        System.out.println("Все коллекции заполнены за " + (System.currentTimeMillis() - startFill) + " мс\n");

        System.out.println("Добавление в начало:");
        System.out.println("ArrayList: " + addFirst(arrayList) + " мс");
        System.out.println("ArrayDeque: " + addFirst(arrayDeque) + " мс");
        System.out.println("TreeSet:" + addElement(treeSet) + " мс (вставка в отсортированное множество)\n");

        System.out.println("Добавление в середину:");
        System.out.println("ArrayList: " + addMiddle(arrayList) + " мс");
        System.out.println("ArrayDeque: нет доступа по индексу");
        System.out.println("TreeSet: " + addElement(treeSet) + " мс (вставка в отсортированное множество)\n");

        System.out.println("Добавление в конец:");
        System.out.println("ArrayList: " + addLast(arrayList) + " мс");
        System.out.println("ArrayDeque: " + addLast(arrayDeque) + " мс");
        System.out.println("TreeSet: " + addElement(treeSet) + " мс (вставка в отсортированное множество)\n");

        System.out.println("Удаление из начала:");
        System.out.println("ArrayList: " + removeFirst(arrayList) + " мс");
        System.out.println("ArrayDeque: " + removeFirst(arrayDeque) + " мс");
        System.out.println("TreeSet: " + removeFirst(treeSet) + " мс (удаление наименьшего)\n");

        System.out.println("Удаление из середины:");
        System.out.println("ArrayList: " + removeMiddle(arrayList) + " мс");
        System.out.println("ArrayDeque: нет доступа по индексу");
        System.out.println("TreeSet: " + removeMiddle(treeSet) + " мс (удаление по значению)\n");

        System.out.println("Удаление из конца:");
        System.out.println("ArrayList: " + removeLast(arrayList) + " мс");
        System.out.println("ArrayDeque: " + removeLast(arrayDeque) + " мс");
        System.out.println("TreeSet: " + removeLast(treeSet) + " мс (удаление наибольшего)\n");

        System.out.println("Получение по индексу " + ITERATIONS_COUNT + " раз");
        System.out.println("ArrayList: " + getByIndex(arrayList) + " мс");
        System.out.println("ArrayDeque: нет доступа по индексу");
        System.out.println("TreeSet: нет доступа по индексу");
    }

    // Добавление в начало
    private static long addFirst(ArrayList<Integer> list) {
        long start = System.currentTimeMillis();
        for (int j = 0; j < TEST_ITERATIONS; j++) {
            list.add(0, ELEMENTS_COUNT + j);
        }
        long time = System.currentTimeMillis() - start;

        for (int j = 0; j < TEST_ITERATIONS; j++) {
            list.remove(0);
        }
        return time;
    }

    private static long addFirst(ArrayDeque<Integer> deque) {
        long start = System.currentTimeMillis();
        for (int j = 0; j < TEST_ITERATIONS; j++) {
            deque.addFirst(ELEMENTS_COUNT + j);
        }
        long time = System.currentTimeMillis() - start;

        for (int j = 0; j < TEST_ITERATIONS; j++) {
            deque.removeFirst();
        }
        return time;
    }

    // Добавление в середину
    private static long addMiddle(ArrayList<Integer> list) {
        int mid = list.size() / 2;
        long start = System.currentTimeMillis();
        for (int j = 0; j < TEST_ITERATIONS; j++) {
            list.add(mid, ELEMENTS_COUNT + j);
        }
        long time = System.currentTimeMillis() - start;

        for (int j = 0; j < TEST_ITERATIONS; j++) {
            list.remove(mid);
        }
        return time;
    }

    // Добавление в конец
    private static long addLast(ArrayList<Integer> list) {
        long start = System.currentTimeMillis();
        for (int j = 0; j < TEST_ITERATIONS; j++) {
            list.add(ELEMENTS_COUNT + j);
        }
        long time = System.currentTimeMillis() - start;

        for (int j = 0; j < TEST_ITERATIONS; j++) {
            list.remove(list.size() - 1);
        }
        return time;
    }

    private static long addLast(ArrayDeque<Integer> deque) {
        long start = System.currentTimeMillis();
        for (int j = 0; j < TEST_ITERATIONS; j++) {
            deque.addLast(ELEMENTS_COUNT + j);
        }
        long time = System.currentTimeMillis() - start;

        for (int j = 0; j < TEST_ITERATIONS; j++) {
            deque.removeLast();
        }
        return time;
    }

    // Добавление в TreeSet
    private static long addElement(TreeSet<Integer> set) {
        long start = System.currentTimeMillis();
        for (int j = 0; j < TEST_ITERATIONS; j++) {
            set.add(ELEMENTS_COUNT + j);
        }
        long time = System.currentTimeMillis() - start;

        for (int j = 0; j < TEST_ITERATIONS; j++) {
            set.remove(ELEMENTS_COUNT + j);
        }
        return time;
    }

    // Удаление из начала
    private static long removeFirst(ArrayList<Integer> list) {
        long start = System.currentTimeMillis();
        for (int j = 0; j < TEST_ITERATIONS; j++) {
            list.remove(0);
        }
        long time = System.currentTimeMillis() - start;

        for (int j = 0; j < TEST_ITERATIONS; j++) {
            list.add(ELEMENTS_COUNT + j);
        }
        return time;
    }

    private static long removeFirst(ArrayDeque<Integer> deque) {
        long start = System.currentTimeMillis();
        for (int j = 0; j < TEST_ITERATIONS; j++) {
            deque.removeFirst();
        }
        long time = System.currentTimeMillis() - start;

        for (int j = 0; j < TEST_ITERATIONS; j++) {
            deque.addFirst(ELEMENTS_COUNT + j);
        }
        return time;
    }

    private static long removeFirst(TreeSet<Integer> set) {
        long start = System.currentTimeMillis();
        for (int j = 0; j < TEST_ITERATIONS; j++) {
            set.pollFirst();
        }
        long time = System.currentTimeMillis() - start;

        for (int j = 0; j < TEST_ITERATIONS; j++) {
            set.add(ELEMENTS_COUNT + j);
        }
        return time;
    }

    // Удаление из середины
    private static long removeMiddle(ArrayList<Integer> list) {
        int mid = list.size() / 2;
        long start = System.currentTimeMillis();
        for (int j = 0; j < TEST_ITERATIONS; j++) {
            list.remove(mid);
        }
        long time = System.currentTimeMillis() - start;

        for (int j = 0; j < TEST_ITERATIONS; j++) {
            list.add(mid, ELEMENTS_COUNT + j);
        }
        return time;
    }

    private static long removeMiddle(TreeSet<Integer> set) {
        int startVal = set.size() / 2;
        long start = System.currentTimeMillis();
        for (int j = 0; j < TEST_ITERATIONS; j++) {
            set.remove(startVal + j);
        }
        long time = System.currentTimeMillis() - start;

        for (int j = 0; j < TEST_ITERATIONS; j++) {
            set.add(ELEMENTS_COUNT + j);
        }
        return time;
    }

    // Удаление из конца
    private static long removeLast(ArrayList<Integer> list) {
        long start = System.currentTimeMillis();
        for (int j = 0; j < TEST_ITERATIONS; j++) {
            list.remove(list.size() - 1);
        }
        long time = System.currentTimeMillis() - start;

        for (int j = 0; j < TEST_ITERATIONS; j++) {
            list.add(ELEMENTS_COUNT + j);
        }
        return time;
    }

    private static long removeLast(ArrayDeque<Integer> deque) {
        long start = System.currentTimeMillis();
        for (int j = 0; j < TEST_ITERATIONS; j++) {
            deque.removeLast();
        }
        long time = System.currentTimeMillis() - start;

        for (int j = 0; j < TEST_ITERATIONS; j++) {
            deque.addLast(ELEMENTS_COUNT + j);
        }
        return time;
    }

    private static long removeLast(TreeSet<Integer> set) {
        long start = System.currentTimeMillis();
        for (int j = 0; j < TEST_ITERATIONS; j++) {
            set.pollLast();
        }
        long time = System.currentTimeMillis() - start;

        for (int j = 0; j < TEST_ITERATIONS; j++) {
            set.add(ELEMENTS_COUNT + j);
        }
        return time;
    }

    private static long getByIndex(ArrayList<Integer> list) {
        long start = System.currentTimeMillis();
        long item;
        for (long i = 0; i < ITERATIONS_COUNT; i++) {
            item = list.get((int) (i % ELEMENTS_COUNT));

        }
        long end = System.currentTimeMillis();
        return end - start;
    }


}

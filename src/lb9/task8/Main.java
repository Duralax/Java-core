package lb9.task8;

public class Main {
    public static void main(String[] args) {

        Task8 listHead = new Task8();
        Task8 listTail = new Task8();

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {10, 20, 30, 40, 50};

        System.out.println("Для вставки с головы:");

        listHead.createHead(numbers1);
        System.out.println("createHead: " + listHead.toString());

        listHead.AddFirst(0);
        System.out.println("AddFirst(0): " + listHead.toString());

        listHead.Insert(99, 3);
        System.out.println("Insert(99, 3): " + listHead.toString());

        listHead.AddLast(6);
        System.out.println("AddLast(6): " + listHead.toString());

        listHead.RemoveFirst();
        System.out.println("RemoveFirst: " + listHead.toString());

        listHead.Remove(2);
        System.out.println("Remove(2): " + listHead.toString());

        listHead.RemoveLast();
        System.out.println("RemoveLast: " + listHead.toString());

        System.out.println();
        System.out.println("Для вставки с хвоста:");
        listTail.createTail(numbers2);
        System.out.println("createTail: " + listTail.toString());

        listTail.AddFirst(5);
        System.out.println("AddFirst(5): " + listTail.toString());

        listTail.Insert(99, 2);
        System.out.println("Insert(99, 2): " + listTail.toString());

        listTail.AddLast(60);
        System.out.println("AddLast(60): " + listTail.toString());

        listTail.RemoveFirst();
        System.out.println("RemoveFirst: " + listTail.toString());

        listTail.Remove(3);
        System.out.println("Remove(3): " + listTail.toString());

        listTail.RemoveLast();
        System.out.println("RemoveLast: " + listTail.toString());

        System.out.println();
        System.out.println("Рекурсии:");

        Task8 listRec1 = new Task8();
        int[] recNumbers1 = {1, 2, 3, 4, 5};
        listRec1.createHeadRec(recNumbers1);
        System.out.println("createHeadRec: " + listRec1.toStringRec());

        Task8 listRec2 = new Task8();
        int[] recNumbers2 = {10, 20, 30, 40, 50};
        listRec2.createTailRec(recNumbers2);
        System.out.println("createTailRec: " + listRec2.toStringRec());
    }
}

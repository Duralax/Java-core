package lb9.task8;

public class Task8 {

    private Node head;

    public void createHead(int[] data) {
        head = null;
        for (int i = data.length - 1; i >= 0; i--) {
            head = new Node(data[i], head);
        }
    }

    public void createTail(int[] data){
        if (data.length == 0){
            head = null;
            return;
        }
        head = new Node(data[0], null);
        Node current = head;

        for (int i = 1; i < data.length; i++){
            current.next = new Node(data[i], null);
            current = current.next;
        }
    }

    @Override
    public String toString(){
        if (head == null){
            return ("Пустой список");
        }
        String result = "";
        Node current = head;
        while (current != null){
            result = result + current.value + " ";
            current = current.next;
        }
        return result;
    }

    public void AddFirst(int data){
        head = new Node(data, head);
    }

    public void AddLast(int data){
        Node newNode = new Node(data, null);
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void Insert(int data, int position){
        if (position == 0){
            AddFirst(data);
            return;
        }
        Node newNode = new Node(data, null);
        Node current = head;
        int index = 0;

        while (current != null && index < position - 1){
            current = current.next;
            index++;
        }
        if (current == null){
            System.out.println("Заданная позиция больше длины списка");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void RemoveFirst(){
        if (head == null){
            System.out.println("Список пуст");
            return;
        }
        head = head.next;
    }

    public void RemoveLast(){
        Node current = head;

        if (head == null){
            System.out.println("Список пуст");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    public void Remove(int position){
        if (head == null){
            System.out.println("Список пуст");
            return;
        }
        if (position == 0) {
            RemoveFirst();
            return;
        }
        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }
        if (current == null || current.next == null){
            System.out.println("Заданная позиция больше длины списка");
            return;
        }
        current.next = current.next.next;
    }
    public void createHeadRec(int[] values) {
        if (values.length == 0) {
            head = null;
            return;
        }
        head = null;
        createHeadRecArray(values, values.length - 1);
    }

    private void createHeadRecArray(int[] values, int index) {
        if (index < 0) {
            return;
        }
        head = new Node(values[index], head);
        createHeadRecArray(values, index - 1);
    }

    public void createTailRec(int[] values) {
        if (values.length == 0) {
            head = null;
            return;
        }
        head = new Node(values[0], null);
        createTailRecHelper(head, values, 1);
    }

    private void createTailRecHelper(Node current, int[] values, int index) {
        if (index >= values.length) return;
        current.next = new Node(values[index], null);
        createTailRecHelper(current.next, values, index + 1);
    }
    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node node) {
        if (node == null){
            return "Пустой список";
        }
        if (node.next == null){
            return Integer.toString(node.value);
        }
        return node.value + " " + toStringRecHelper(node.next);
    }

}

package lb9.Task5;

public class Task5 {

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
    
    public static void main(String[] args) {
        Task5 list1 = new Task5();
        int[] data1 = {1, 2, 3, 4, 5};
        list1.createHead(data1);
        System.out.println("createHead (с головы): " + list1.toString());

        Task5 list2 = new Task5();
        int[] data2 = {10, 20, 30, 40, 50};
        list2.createTail(data2);
        System.out.println("createTail (с хвоста): " + list2.toString());

    }
}

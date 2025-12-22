package lb6.task3;

public class Main {
    public static void main(String[] args) {

        int[] ints = {1, 21, 3, 9, 30, 101, 4};
        int[] ints2 = {};

        MyClass3.MinFinder(ints);
        MyClass3.MaxFinder(ints);
        MyClass3.AverageFinder(ints);

        MyClass3.MinFinder(ints2);
        MyClass3.MaxFinder(ints2);
        MyClass3.AverageFinder(ints2);

    }
}

package lb9;

public class Example5 {

    private static int fibNum = 0;

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n){
        for (int i = 0; i < fibNum; i++){
            System.out.print("  ");
        }
        System.out.println("fib" + n);
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }else {
            fibNum++;
            int result = fact(n - 1) + fact(n - 2);
            fibNum--;
            return result;
        }

    }
}

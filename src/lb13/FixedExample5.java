package lb13;

public class FixedExample5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e){
            System.out.println("1");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("2");
    }
}

package lb13;

public class FixedExample12 {

    public static void m(String str, double chislo){
        if (str == null){
            try {
                throw new IllegalArgumentException("Строка введена неверно");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
        if (chislo > 0.001){
            try {
                throw new IllegalArgumentException("Неверное число");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        m(null, 0.000001);
    }
}

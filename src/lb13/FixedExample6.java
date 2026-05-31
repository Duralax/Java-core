package lb13;

// Поменял местами catch (RuntimeException e) и catch (Exception e)

public class FixedExample6 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException ("ошибка");
        } catch (ArithmeticException e){
            System.out.println("1");
        } catch (RuntimeException e){
            System.out.println("3");
        }catch (Exception e){
            System.out.println("2");
        }
        System.out.println("4");
    }
}

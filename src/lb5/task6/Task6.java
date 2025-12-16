package lb5.task6;

public class Task6 {

    private int min;
    private int max;

    public Task6(int num1){
        max = num1;
        min = num1;
    }

    public Task6(int num1, int num2){
        if (num1 < num2){
            min = num1;
            max = num2;
        } else {
            min = num2;
            max = num1;
        }
    }

    public void setNum(int num1) {
        if (num1 < min) {
            min = num1;
        }

        if (num1 > max) {
            max = num1;
        }
    }

    public void setNum(int num1, int num2) {
        int newMin, newMax;
        if (num1 < num2) {
            newMin = num1;
            newMax = num2;
        } else {
            newMin = num2;
            newMax = num1;
        }

        if (newMin < min) {
            min = newMin;
        }

        if (newMax > max) {
            max = newMax;
        }
    }

    public void displayMinMax() {

        System.out.println("Значение min: " + min + ", значение max: " + max);
    }


}

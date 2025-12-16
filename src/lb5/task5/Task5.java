package lb5.task5;

public class Task5 {

    private int num;

    public Task5() {
        this.num = 0;
    }

    public Task5(int num) {
        if (num <= 100){
            this.num = num;
        } else {
            this.num = 100;
        }
    }

    public void setNum(int num) {
        if (num <= 100){
            this.num = num;
        } else {
            this.num = 100;
        }
    }

    public void setNum() {
        this.num = 0;
    }

    public int getNum() {
        return num;
    }
}

package macheight.code.challenge.model;

public class Pair {

    private int num1;
    private int num2;

    public Pair(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }

    @Override
    public String toString() {
        return "(" + num1 + ", " + num2 + ")";
    }
}

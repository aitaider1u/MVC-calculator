package model.expression;

public class Number implements Expression{
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int eval() {
        System.out.println(" : "+ this.value);
        return this.value;
    }

}

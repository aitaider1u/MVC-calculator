package model.expression;

import model.expression.Expression;
import model.expression.Number;
import model.expression.binaire.Binaire;

import java.util.ArrayList;

public class Result implements Expression{
    private ArrayList<Expression> expressions = new ArrayList<>();
    private Binaire operation;

    public Result() { }

    public void addExpression(Expression expression){
        this.expressions.add(expression);
        System.out.println(this.expressions.size()+ " la");
    }

    public void setOperation(Binaire operation) {
        if(this.expressions.size()>=1){
            this.operation = operation;
        }
        if (this.expressions.size()>=2){
            this.eval();
        }
    }

    private void updateResult(){
        if(expressions.size() >=2){
            this.operation.setExpGauche(this.expressions.get(0));
            this.operation.setExpDroite(this.expressions.get(1));
            this.expressions.clear();
            this.expressions.add(new Number(this.operation.eval()));
        }
    }

    public int eval(){
        this.updateResult();
        int result = this.expressions.get(0).eval();
        return result;
    }

    public Binaire getOperation() {
        return operation;
    }
}

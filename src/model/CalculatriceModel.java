package model;

import model.expression.Number;
import model.expression.Result;
import model.expression.binaire.Binaire;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class CalculatriceModel {
    private List<View> views = new ArrayList<>();
    private Integer currentNumber = null;
    private Integer currentResult = null;
    private Result result = new Result();
    private ArrayList <String> listOfOperation = new ArrayList<>();
    private StringBuilder  expressionCalculator = new StringBuilder("");

    public CalculatriceModel(){ }

    public void addView(View view){ this.views.add(view); }
    public void notifyViews(){
        for (View v: views)
            v.update();
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
        this.currentResult = currentNumber;
        this.notifyViews();
    }

   public void setOperation(Binaire binaire){
        if(this.currentNumber != null){
            this.result.addExpression(new Number(currentNumber));
            this.listOfOperation.add(""+currentResult);
            this.expressionCalculator.append(""+currentResult);
            this.currentNumber = null;
        }
        this.result.setOperation(binaire);
        this.listOfOperation.add(binaire.getSymbolOperation());
        this.notifyViews();
    }

    public void eval(){
        if(currentNumber != null) {
            this.result.addExpression(new Number(currentResult));
            this.listOfOperation.add(""+currentResult);
            this.expressionCalculator.append(""+this.result.getOperation().getSymbolOperation());
            this.expressionCalculator.append(""+currentResult);
            this.expressionCalculator.append("=");
            this.currentResult = this.result.eval();
            this.expressionCalculator.append(""+currentResult);
            this.currentNumber = null;
        }
        this.listOfOperation.add("=");
        this.listOfOperation.add(""+currentResult);
        this.notifyViews();

    }

    public Integer getCurrentResult() {
        return currentResult;
    }

    public String getListOfOperations(){
        StringBuilder stringBuilder = new StringBuilder("");
        for (String s : this.listOfOperation){
            stringBuilder.append(s+"\n");
        }
        return stringBuilder.toString();
    }

    public String getExpressionCalculator() {
        return expressionCalculator.toString();
    }
}

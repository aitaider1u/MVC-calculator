package controller;

import model.CalculatriceModel;
import model.expression.binaire.Moins;
import model.expression.binaire.Plus;

public class CalculatriceController {
    private CalculatriceModel model;
    private String currentNumber = "";

    public CalculatriceController(CalculatriceModel model) {
        this.model = model;
    }

    public void notifyNumberChange(int digit){
        this.currentNumber = this.currentNumber + digit;
        this.model.setCurrentNumber( Integer.parseInt(this.currentNumber));
    }

    public void notifyAddOperation(int digit){
        if (digit == -100){
            this.model.setOperation(new Plus());
        }
        if (digit == -200){
            this.model.setOperation(new Moins());
        }
        this.currentNumber = "";

    }
    public void notifyEqualOperation(){
        this.model.eval();
        this.currentNumber = "";
    }

}

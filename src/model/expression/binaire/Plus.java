package model.expression.binaire;

import model.expression.Expression;
import model.expression.binaire.Binaire;

public class Plus extends Binaire implements Expression {

    public Plus() {
    }

    @Override
    public int eval() {
        return this.expGauche.eval()  + this.expDroite.eval();
    }

    @Override
    public String getSymbolOperation() {
        return "+";
    }
}

package model.expression.binaire;

import javax.naming.BinaryRefAddr;
import javax.swing.*;

public class Moins extends Binaire {

    public Moins() {
    }

    @Override
    public int eval() {
        return this.expGauche.eval() -this.expDroite.eval();
    }

    @Override
    public String getSymbolOperation() {
        return "-";
    }
}

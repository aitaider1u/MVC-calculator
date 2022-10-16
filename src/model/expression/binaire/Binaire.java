package model.expression.binaire;

import model.expression.Expression;

public abstract class Binaire implements Expression {
    protected Expression expGauche;
    protected Expression expDroite;


    public Binaire() {
    }

    public Expression getExpGauche() {
        return expGauche;
    }

    public void setExpGauche(Expression expGauche) {
        this.expGauche = expGauche;
    }

    public Expression getExpDroite() {
        return expDroite;
    }

    public void setExpDroite(Expression expDroite) {
        this.expDroite = expDroite;
    }

    public String getSymbolOperation(){
        return "";
    }
}

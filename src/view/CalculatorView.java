package view;

import controller.CalculatriceController;
import model.CalculatriceModel;

import javax.swing.*;
import java.awt.*;

public class CalculatorView implements View{


    private CalculatriceModel model;
    private CalculatriceController controller;


    // ...
    private JFrame frame = new JFrame("Calculator");
    private JPanel panel = new JPanel();

    private JLabel expression = new JLabel("");

    public CalculatorView(CalculatriceModel model) {
        this.model = model;
        buildFrame();
    }
    public void buildFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(expression);
        this.frame.getContentPane().add(panel);
        frame.getContentPane().add(panel);
        frame.setSize(600,60);
        frame.setVisible(true);
        this.model.addView(this);
    }

    @Override
    public void update() {
        this.expression.setText(this.model.getExpressionCalculator());
    }
}

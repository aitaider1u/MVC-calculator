package view;

import controller.CalculatriceController;
import model.CalculatriceModel;

import javax.swing.*;
import java.awt.*;

public class ListOperationView implements View{

    private CalculatriceModel model;
    private CalculatriceController controller;


    // ...
    private JFrame frame = new JFrame("List");
    private JPanel panel = new JPanel();
    private TextArea list = new TextArea("");


    public ListOperationView(CalculatriceModel model) {
        this.model = model;
        buildFrame();
    }

    public void buildFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        list.setPreferredSize(new Dimension(50,300));
        panel.add(list);
        this.frame.getContentPane().add(panel);
        list.setEditable(false);
        frame.setSize(150,300);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
        this.model.addView(this);
    }

    @Override
    public void update() {
        this.list.setText(model.getListOfOperations());
    }
}

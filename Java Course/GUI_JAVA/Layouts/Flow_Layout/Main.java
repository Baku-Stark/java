package GUI_JAVA.Layouts.Flow_Layout;

import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        new MyFlowLayout();
    }
}

class MyFlowLayout extends JFrame{
    JPanel panel = new JPanel();

    MyFlowLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        this.panel.setPreferredSize(new Dimension(250, 250));
        this.panel.setBackground(Color.LIGHT_GRAY);
        this.panel.setLayout(new FlowLayout());

        this.panel.add(new JButton("1"));
        this.panel.add(new JButton("2"));
        this.panel.add(new JButton("3"));
        this.panel.add(new JButton("4"));
        this.panel.add(new JButton("5"));
        this.panel.add(new JButton("6"));
        this.panel.add(new JButton("7"));
        this.panel.add(new JButton("8"));
        this.panel.add(new JButton("9"));

        this.add(panel);
        this.setVisible(true);
    }
}
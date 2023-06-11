package GUI_JAVA.Panels;

import javax.swing.*;

import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args){
        new MyComponent();
    }
}

class MyComponent extends JFrame{
    ImageIcon icon = new ImageIcon("icons/grapes.png");

    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    JPanel redpanel = new JPanel();
    JPanel greenpanel = new JPanel();
    JPanel bluepanel = new JPanel();

    MyComponent(){
        this.label.setText("Hi");
        this.label.setIcon(this.icon);
        this.label.setVerticalAlignment(JLabel.BOTTOM);
        this.label.setHorizontalAlignment(JLabel.RIGHT);

        this.redpanel.setBackground(Color.RED);
        this.redpanel.setBounds(0, 0, 250, 250);
        this.greenpanel.setLayout(new BorderLayout());

        this.greenpanel.setBackground(Color.GREEN);
        this.greenpanel.setBounds(0, 250, 500, 250);
        this.greenpanel.setLayout(new BorderLayout());

        this.bluepanel.setBackground(Color.BLUE);
        this.bluepanel.setBounds(250, 0, 250, 250);


        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLayout(null);
        this.frame.setSize(750, 750);
        this.frame.setVisible(true);
        this.frame.add(this.redpanel);
        this.frame.add(this.greenpanel);
        this.frame.add(this.bluepanel);

        this.greenpanel.add(this.label);
    }
}
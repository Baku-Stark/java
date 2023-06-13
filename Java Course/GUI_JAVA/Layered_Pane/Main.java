package GUI_JAVA.Layered_Pane;

import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        new MyLayeredPane();
    }
}

class MyLayeredPane extends JFrame{
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLayeredPane layered_pane = new JLayeredPane();

    MyLayeredPane(){
        this.label1.setOpaque(true);
        this.label1.setBackground(Color.RED);
        this.label1.setBounds(50, 50, 200, 200);

        this.label2.setOpaque(true);
        this.label2.setBackground(Color.GREEN);
        this.label2.setBounds(100, 100, 200, 200);

        this.label3.setOpaque(true);
        this.label3.setBackground(Color.BLUE);
        this.label3.setBounds(150, 150, 200, 200);

        this.layered_pane.add(this.label1, Integer.valueOf(0));
        this.layered_pane.add(this.label2, Integer.valueOf(2));
        this.layered_pane.add(this.label3, Integer.valueOf(1));

        this.layered_pane.setBounds(0, 0, 500, 500);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(new Dimension(500, 500));
        this.setLayout(null);
        this.setVisible(true);
        this.add(this.layered_pane);
    }
}
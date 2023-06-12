package GUI_JAVA.Layouts.Border_Layout;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class Main {
    public static void main(String[] args){
        new MyBorderLayout();
    }
}

class MyBorderLayout extends JFrame{
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();
    JPanel panel8 = new JPanel();
    JPanel panel9 = new JPanel();
    JPanel panel10 = new JPanel();

    MyBorderLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new BorderLayout(10, 10)); // espaçamengo de largura e altura
        this.setVisible(true);

        this.panel1.setBackground(Color.RED);
        this.panel2.setBackground(Color.GREEN);
        this.panel3.setBackground(Color.YELLOW);
        this.panel4.setBackground(Color.MAGENTA);
        this.panel5.setBackground(Color.BLUE);

        this.panel1.setPreferredSize(new Dimension(100, 100));
        this.panel2.setPreferredSize(new Dimension(100, 100));
        this.panel3.setPreferredSize(new Dimension(100, 100));
        this.panel4.setPreferredSize(new Dimension(100, 100));
        this.panel5.setPreferredSize(new Dimension(100, 100));

        // ---------------- sub panels ----------------
        this.panel6.setBackground(Color.BLACK);
        this.panel7.setBackground(Color.DARK_GRAY);
        this.panel8.setBackground(Color.GRAY);
        this.panel9.setBackground(Color.LIGHT_GRAY);
        this.panel10.setBackground(Color.WHITE);
        
        this.panel5.setLayout(new BorderLayout());

        this.panel6.setPreferredSize(new Dimension(50, 50));
        this.panel7.setPreferredSize(new Dimension(50, 50));
        this.panel8.setPreferredSize(new Dimension(50, 50));
        this.panel9.setPreferredSize(new Dimension(50, 50));
        this.panel10.setPreferredSize(new Dimension(50, 50));

        this.panel5.add(this.panel6, BorderLayout.NORTH);
        this.panel5.add(this.panel7, BorderLayout.WEST);
        this.panel5.add(this.panel8, BorderLayout.EAST);
        this.panel5.add(this.panel9, BorderLayout.SOUTH);
        this.panel5.add(this.panel10, BorderLayout.CENTER);
        // ---------------- sub panels ----------------

        this.add(this.panel1, BorderLayout.NORTH);
        this.add(this.panel2, BorderLayout.WEST);
        this.add(this.panel3, BorderLayout.EAST);
        this.add(this.panel4, BorderLayout.SOUTH);
        this.add(this.panel5, BorderLayout.CENTER);
    }
}
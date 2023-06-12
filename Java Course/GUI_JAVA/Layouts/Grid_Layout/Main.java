package GUI_JAVA.Layouts.Grid_Layout;

import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        new MyGridLayout();
    }
}

class MyGridLayout extends JFrame{
    MyGridLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new GridLayout(3, 3, 10, 10)); // (ROWS, COLS, SPACING_x, SPACING_Y)

        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));

        this.setVisible(true);
    }
}
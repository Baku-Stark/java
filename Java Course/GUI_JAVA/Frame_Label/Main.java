package GUI_JAVA.Frame_Label;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.Container;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args){
        // MyFrame frame = new MyFrame();
        new MyFrame();
    }
}

class MyFrame extends JFrame{
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    Border border = BorderFactory.createLineBorder(Color.green, 3);
    
    MyFrame(){
        this.frame.setTitle("JFrame title goes here");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.frame.setResizable(false);
        this.frame.setSize(500, 500);
        this.frame.setVisible(true);
        // frame.getContentPane().setBackground(Color.green);
        // this.frame.getContentPane().setBackground(new Color(0, 0, 0));
        this.frame.setLayout(null);
        // adicionar a label
        this.frame.add(this.label);
        // this.frame.pack();

        ImageIcon icon = new ImageIcon("image/runa-icon.png", "app icon");
        this.frame.setIconImage(icon.getImage());

        ImageIcon icon_label = new ImageIcon("image/dude.png", "app icon label");
        this.label.setIcon(icon_label);
        this.label.setIconTextGap(25);
        this.label.setBackground(Color.BLACK);
        this.label.setOpaque(true);
        this.label.setBorder(this.border);
        this.label.setVerticalAlignment(JLabel.CENTER);
        this.label.setHorizontalAlignment(JLabel.CENTER);
        this.label.setText("Bro, do you even code?");
        this.label.setHorizontalTextPosition(JLabel.CENTER);
        this.label.setBounds(0, 0, 250, 250);
        this.label.setVerticalTextPosition(JLabel.TOP);
        this.label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        this.label.setForeground(new Color(0x00FF00));
    }
}
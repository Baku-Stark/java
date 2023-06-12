package GUI_JAVA.Buttons;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        new MyButtons();
    }
}


class MyButtons extends JFrame implements ActionListener{
    JButton button = new JButton();
    JLabel label = new JLabel();

    ImageIcon icon = new ImageIcon("icons/grapes.png");
    ImageIcon icon_label = new ImageIcon("icons/melon.png");

    MyButtons(){
        this.label.setIcon(this.icon_label);
        this.label.setBounds(150, 350, 150, 150);
        this.label.setVisible(false);

        this.button.setBounds(100, 100, 250, 250);
        this.button.addActionListener(this);
        this.button.setText("I'm a button!");
        this.button.setFocusable(false);
        this.button.setIcon(this.icon);
        this.button.setHorizontalTextPosition(JButton.CENTER);
        this.button.setVerticalTextPosition(JButton.BOTTOM);
        this.button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        this.button.setIconTextGap(-15);
        this.button.setForeground(Color.CYAN);
        this.button.setBackground(Color.LIGHT_GRAY);
        this.button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        this.add(this.button);
        this.add(this.label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.button){
            System.out.println("HEY!");
            this.button.setEnabled(false);
            this.label.setVisible(true);
        }
    }
}
package GUI_JAVA.Check_Box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        new MyCheckBox();
    }
}

class MyCheckBox extends JFrame implements ActionListener{
    JCheckBox checkBox = new JCheckBox();
    JButton button = new JButton("Submit");

    ImageIcon icon_true = new ImageIcon("icon/true.png");
    ImageIcon icon_false = new ImageIcon("icon/false.png");

    MyCheckBox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.checkBox.setText("I'm not a robot");
        this.checkBox.setFocusable(false);
        this.checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        
        this.checkBox.setIcon(icon_false);
        this.checkBox.setSelectedIcon(icon_true);

        this.button.addActionListener(this);

        this.add(this.button);
        this.add(this.checkBox);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.button){
            System.out.println(this.checkBox.isSelected());
        }
    }
}
package GUI_JAVA.Text_Fied;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        new MyTextField();
    }
}

class MyTextField extends JFrame implements ActionListener{
    JButton button_enter = new JButton("Submit");
    JTextField textField = new JTextField("Username");

    MyTextField(){
        this.button_enter.addActionListener(this);

        this.textField.setPreferredSize(new Dimension(250, 40));
        this.textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        this.textField.setForeground(new Color(0x00FF00));
        this.textField.setBackground(Color.BLACK);
        this.textField.setCaretColor(Color.WHITE);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(this.button_enter);
        this.add(this.textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.button_enter){
            // PEGAR O TEXTO DO [TEXTFIELD]
            System.out.println(this.textField.getText());
        }
    }
}
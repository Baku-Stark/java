package GUI_JAVA.New_GUI_Window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        new LaunchPage();
    }
}

class LaunchPage extends JFrame implements ActionListener{
    JButton button = new JButton("New Window");

    LaunchPage(){
        this.button.setBounds(100, 160, 200, 40);
        this.button.setFocusable(false);
        this.button.addActionListener(this);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);

        this.add(this.button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.button){
            this.dispose();
            new NewWindow();
        }
    }
}

class NewWindow  extends JFrame{
    JLabel label = new JLabel();

    NewWindow(){
        this.label.setText("Hello!");
        this.label.setVisible(true);
        this.label.setBounds(0, 0, 100, 50);
        this.setFont(new Font(null, Font.PLAIN, 25));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);

        this.add(this.label);
    }
}
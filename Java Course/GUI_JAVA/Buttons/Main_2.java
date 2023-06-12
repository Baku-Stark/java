package GUI_JAVA.Buttons;

import javax.swing.*;

public class Main_2 {
    public static void main(String[] args) {
        new MyButtons();
    }
}


class MyButtons extends JFrame{
    JButton button = new JButton();

    MyButtons(){
        this.button.setBounds(200, 100, 100, 50);
        this.button.addActionListener(e -> System.out.println("HEY!"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);

        this.add(this.button);
    }
}

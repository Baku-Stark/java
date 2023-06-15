package GUI_JAVA.Color_Chooser;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        new MyColorChooser();
    }
}


class MyColorChooser extends JFrame implements ActionListener{
    JLabel label = new JLabel();
    JButton button = new JButton("Pick a color");

    MyColorChooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        label.setText("This is some text :D!");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setOpaque(true);

        button.addActionListener(this);

        // this.add(colorChooser);
        this.add(button);
        this.add(label);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            new JColorChooser();

            // PEGAR O VALOR DA COR
            Color color = JColorChooser.showDialog(null, "Pick a color... I guess", Color.BLACK);

            this.label.setForeground(color);
        }
    }
}
package GUI_JAVA.Combo_Box;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        new MyComboBox();
    }
}

class MyComboBox extends JFrame implements ActionListener{
    String[] animals = {"Dog", "Cat", "Bird"};

    JComboBox<String> combobox = new JComboBox<String>(animals);

    MyComboBox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        combobox.addItem("Horse");
        combobox.addActionListener(this);

        this.add(combobox);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == combobox){
            // PEGANDO O ITEM SELECIONADO NO COMBOBOX [nome]
            System.out.println(this.combobox.getSelectedItem());

            // PEGANDO O ITEM SELECIONADO NO COMBOBOX [indice]
            System.out.println(this.combobox.getSelectedIndex());
        }
    }
}
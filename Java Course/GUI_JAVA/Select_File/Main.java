package GUI_JAVA.Select_File;

import java.io.File;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main{
    public static void main(String[] args) {
        new MyFile();
    }
}

class MyFile extends JFrame implements ActionListener{
    JButton button = new JButton("Select File");

    MyFile(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            JFileChooser fileChooser = new JFileChooser();

            int response = fileChooser.showSaveDialog(null);

            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
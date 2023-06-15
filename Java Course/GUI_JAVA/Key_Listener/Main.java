package GUI_JAVA.Key_Listener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        new MyKeyListener();
    }
}


class MyKeyListener extends JFrame implements KeyListener{
    JLabel label = new JLabel();
    ImageIcon icon = new ImageIcon("rocket.png");

    MyKeyListener(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        // CHAMAR AS FUNÇÕES DO TECLADO
        this.addKeyListener(this);

        label.setBounds(0, 0, 100, 100);
        label.setIcon(icon);
        // label.setBackground(Color.RED);
        // label.setOpaque(true);

        this.add(label);

        this.getContentPane().setBackground(Color.BLACK);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'a' : this.label.setLocation(label.getX()-10, label.getY());
                break;

            case 'w' : this.label.setLocation(label.getX(), label.getY()-10);
                break;

            case 's' : this.label.setLocation(label.getX(), label.getY()+10);
                break;

            case 'd' : this.label.setLocation(label.getX()+10, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        /*
         *  quando uma tecla é apertada
        */

        // TECLA APERTADA [LETRA]
        System.out.println("You released key char: " + e.getKeyChar());

        // TECLA APERTADA [CÓDIGO DA LETRA]
        System.out.println("You released key code: " + e.getKeyCode());
        System.out.println("");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
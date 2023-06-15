package GUI_JAVA.Mouse_Listener;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        new MyMouseListener();
    }
}

class MyMouseListener extends JFrame implements MouseListener{
    JLabel label = new JLabel();

    ImageIcon pizza = new ImageIcon("icon/pizza.png");
    ImageIcon hamburger = new ImageIcon("icon/hamburger.png");
    ImageIcon hotdog = new ImageIcon("icon/hot-dog.png");

    MyMouseListener(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        // CHAMAR FUNÇÃO DE MOUSE
        label.addMouseListener(this);

        label.setIcon(pizza);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Chamado quando o botão do mouse foi clicado (pressione e solte) no componente

        System.out.println("Você clicou normalmente!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Chamado quando o botão do mouse foi clicado no componente

        System.out.println("Você pressionou!");
        this.label.setIcon(hotdog);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Chamado quando o botão do mouse é solto em um componente

        System.out.println("Você soltou!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Quando o mouse ENTRA em um componente

        System.out.println("Você entrou!");
        this.label.setIcon(hamburger);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Quando o mouse SAI de um componente
        
        System.out.println("Você saiu!");
        this.label.setIcon(pizza);
    }
}
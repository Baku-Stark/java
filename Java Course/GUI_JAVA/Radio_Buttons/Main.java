package GUI_JAVA.Radio_Buttons;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        new MyRadioButton();
    }
}

class MyRadioButton extends JFrame implements ActionListener{
    ImageIcon pizzaIcon = new ImageIcon("icon/pizza.png");
    ImageIcon hamburgerIcon = new ImageIcon("icon/hamburger.png");
    ImageIcon hotdogIcon = new ImageIcon("icon/hot-dog.png");

    JRadioButton pizzaButton = new JRadioButton("Pizza", pizzaIcon);
    JRadioButton hamburgerButton = new JRadioButton("Hamburger", hamburgerIcon);
    JRadioButton hotdogButton = new JRadioButton("Hotdog", hotdogIcon);

    MyRadioButton(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // PARA EVITAT MULTIPLAS ESCOLHAS:
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizzaButton){
            System.out.println("You ordered Pizza!");
        }

        else if(e.getSource() == hamburgerButton){
            System.out.println("You ordered Hamburger!");
        }

        else if(e.getSource() == hotdogButton){
            System.out.println("You ordered Hot Dog!");
        }
    }
}
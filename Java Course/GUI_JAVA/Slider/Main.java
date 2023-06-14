package GUI_JAVA.Slider;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Main {
    public static void main(String[] args) {
        new MySlider();
    }
}

class MySlider extends JFrame implements ChangeListener{
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JSlider slider = new JSlider(0, 100, 50);

    MySlider(){
        this.setTitle("Slider Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.add(slider);
        panel.add(label);
        
        slider.addChangeListener(this);
        // `---> Ativar um comando com o Slider
        
        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        // `---> mostrar quantidade de números entre os espaços [10, 20, 30, etc]

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        // `---> mostrar APENAS a quantidade de números escolhida pelo usuário [0, 25, 50, etc]

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        slider.setOrientation(SwingConstants.VERTICAL);


        label.setText(" °C = " + this.slider.getValue());
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));

        this.add(panel);
        this.setSize(420, 420);
        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource() == slider){
            // Pegar o valor do SLIDER
            // System.out.println(this.slider.getValue());
            label.setText("°C = " + this.slider.getValue());
        }
    }
}
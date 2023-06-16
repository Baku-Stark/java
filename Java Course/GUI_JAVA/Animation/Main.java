package GUI_JAVA.Animation;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Main {
    public static void main(String[] args) {
        new MyAnimation();
    }
}

class MyAnimation extends JFrame{
    MyPanel myPanel = new MyPanel();

    MyAnimation(){
        this.add(myPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel implements ActionListener{
    Image enemy = new ImageIcon("enemy.png").getImage();
    Image backgroundImage = new ImageIcon("planet.jpeg").getImage();

    Timer timer = new Timer(10, this);

    int xVelocity = 2;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);

        timer.start();
    }

    public void paint(Graphics g){
        super.paint(g); //paint background
        Graphics g2D = (Graphics2D) g;

        g2D.drawImage(backgroundImage, 0, 0, null);
        g2D.drawImage(enemy, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.x >= this.PANEL_WIDTH - this.enemy.getWidth(null) || this.x < 0){
            this.xVelocity *= -1;
        }

        if(this.y >= this.PANEL_HEIGHT - this.enemy.getWidth(null) || this.y < 0){
            this.yVelocity *= -1;
        }

        this.x += this.xVelocity;
        this.y += this.yVelocity;
        repaint();
    }
}
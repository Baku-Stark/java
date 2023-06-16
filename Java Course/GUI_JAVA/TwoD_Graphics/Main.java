package GUI_JAVA.TwoD_Graphics;

import java.awt.*;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        new MyGraphics();
    }
}

class MyGraphics extends JFrame{
    MyPanel panel = new MyPanel();

    MyGraphics(){
        this.add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel{
    Image image = new ImageIcon("sky.jpg").getImage();

    MyPanel(){
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        // Inserir uma imagem
        g2D.drawImage(image, 0, 0, null);

        // g2D.setPaint(Color.BLUE);
        // g2D.setStroke(new BasicStroke(5));

        // // Desenhar uma linha
        // g2D.drawLine(0, 0, 500, 500);

        // // Desenhar um retângulo (sem cor de preenchimento)
        // g2D.drawRect(0, 0, 100, 200);
        // // Desenhar um retângulo (com cor de preenchimento)
        // g2D.fillRect(0, 0, 100, 200);

        // // Desenhar um circulo (sem cor de preenchimento)
        // g2D.drawOval(0, 0, 100, 100);
        // // Desenhar um circulo (com cor de preenchimento)
        // g2D.fillOval(0, 0, 100, 100);

        // // Desenhar uma meia-lua (sem cor de preenchimento)
        // g2D.drawArc(0, 0, 100, 100, 0, 180);
        // // Desenhar uma meia-lua (sem cor de preenchimento)
        // g2D.fillArc(0, 0, 100, 100, 0, 180);

        // // Desenhar um triângulo (sem cor de preenchimento)
        // int[] xPoints = {150, 250, 350};
        // int[] yPoints = {300, 150, 300};
        // g2D.setPaint(Color.YELLOW);
        // g2D.drawPolygon(xPoints, yPoints, 3);
        // // Desenhar um triângulo (com cor de preenchimento)
        // g2D.fillPolygon(xPoints, yPoints, 3);

        // // Desenhar um texto
        // g2D.setPaint(Color.BLUE);
        // g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        // g2D.drawString("U R A WINNER! :D", 50, 50);
    }
}
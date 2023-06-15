package GUI_JAVA.Drag_And_Drop;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        new MyDragDrop();
    }
}

class MyDragDrop extends JFrame{
    DragPanel dragPanel = new DragPanel();

    MyDragDrop(){
        this.add(dragPanel);

        this.setTitle("Drag & Drop Demo");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class DragPanel extends JPanel{
    ImageIcon image = new ImageIcon("icon/hamburger.png");

    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();

    Point imageCorner = new Point(0, 0);
    Point prevPt;

    DragPanel(){
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();

        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevPt = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();
            imageCorner.translate(
                (int)(currentPt.getX() - prevPt.getX()),
                (int)(currentPt.getY() - prevPt.getY())
            );
            prevPt = currentPt;
            repaint();
        }
    }
}
package GUI_JAVA.Key_Binginds;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// import java.awt.Desktop.Action;

public class Main{
	public static void main(String[] args) {
		new MyKeyBinginds();
	}
}

class MyKeyBinginds extends JFrame{
	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;

	JLabel label = new JLabel();


	MyKeyBinginds(){
		this.setTitle("KeyBinding Demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);

        label.setBackground(Color.RED);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getActionMap().put("upAction", upAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        this.add(label);
        this.setVisible(true);
	}

	public class UpAction extends AbstractAction{
		@Override
		public void actionPerformed(ActionEvent e){
			label.setLocation(label.getX(), label.getY()-10);
		}
	}

	public class LeftAction extends AbstractAction{
		@Override
		public void actionPerformed(ActionEvent e){
			label.setLocation(label.getX()-10, label.getY());
		}
	}

	public class RightAction extends AbstractAction{
		@Override
		public void actionPerformed(ActionEvent e){
			label.setLocation(label.getX()+10, label.getY());
		}
	}

	public class DownAction extends AbstractAction{
		@Override
		public void actionPerformed(ActionEvent e){
			label.setLocation(label.getX(), label.getY()+10);
		}
	}
}
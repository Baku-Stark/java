package GUI_JAVA.Menu_Bar;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Main {
    public static void main(String[] args) {
        new MyMenuBar();
    }
}

class MyMenuBar extends JFrame implements ActionListener{
    JMenuBar menubar = new JMenuBar();
    // [SELECTORS]
    JMenu file_menu = new JMenu("File");
    JMenu edit_menu = new JMenu("Edit");
    JMenu help_menu = new JMenu("Help");

    // [OPTIONS]
    JMenuItem load_item = new JMenuItem();
    JMenuItem save_item = new JMenuItem();
    JMenuItem exit_item = new JMenuItem();

    // [ICONS]
    ImageIcon load_icon = new ImageIcon("icon/load.png");
    ImageIcon save_icon = new ImageIcon("icon/save.png");
    ImageIcon exit_icon = new ImageIcon("icon/exit.png");

    MyMenuBar(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        menubar.add(file_menu);
        menubar.add(edit_menu);
        menubar.add(help_menu);

        save_item.setIcon(save_icon);
        save_item.setText("Save");

        load_item.setIcon(load_icon);
        load_item.setText("Load");

        exit_item.setIcon(exit_icon);
        exit_item.setText("Exit");

        file_menu.add(save_item);
        file_menu.add(load_item);
        file_menu.add(exit_item);

        exit_item.addActionListener(this);

        this.setJMenuBar(menubar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exit_item){
            // fechar a aplicação
            System.exit(0);
        }
    }
}
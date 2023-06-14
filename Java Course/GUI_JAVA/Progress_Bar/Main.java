package GUI_JAVA.Progress_Bar;

import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        new MyProgressBar();
    }
}


class MyProgressBar extends JFrame{
    JProgressBar progress = new JProgressBar(0, 500);

    MyProgressBar(){
        progress.setValue(0);
        progress.setBounds(0, 0, 420, 50);
        progress.setStringPainted(true);
        progress.setFont(new Font("MV Boli", Font.BOLD, 25));
        progress.setForeground(Color.RED);
        progress.setBackground(Color.BLACK);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);

        this.add(progress);
        this.setVisible(true);

        this.fill();
    }

    public void fill(){
        int counter = 500;

        while(counter > 0){
            progress.setValue(counter);
            try {
                Thread.sleep(50);
            }
            catch (Exception e) {
                e.printStackTrace();
            }

            counter -= 10;
        }

        progress.setString("Done!");
    }
}
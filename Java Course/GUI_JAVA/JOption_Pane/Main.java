package GUI_JAVA.JOption_Pane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(
            null,
            "This is some useless info",
            "Title",
            JOptionPane.PLAIN_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null,
            "This is some useless info",
            "Title",
            JOptionPane.QUESTION_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null,
            "This is some important info",
            "Title",
            JOptionPane.INFORMATION_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null,
            "ERROR !!!!",
            "Title",
            JOptionPane.ERROR_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null,
            "WARNING",
            "Title",
            JOptionPane.WARNING_MESSAGE
        );

        System.out.println(
            JOptionPane.showConfirmDialog(
                null,
                "bro, do you even code?",
                "This is my choice",
                JOptionPane.YES_NO_CANCEL_OPTION
            )
        );
        // [YES_NO_CANCEL_OPTION]
            // -1 -> "X" button
            // 0 -> Yes
            // 1 -> No
            // 2 -> Cancel

        String name = JOptionPane.showInputDialog(
            "What's your name?"
        );
        System.out.println(name);

        ImageIcon icon = new ImageIcon("icons/grapes.png");

        String[] responses = {
            "No, you're awesome!",
            "Thank you!",
            "*Blus*"
        };

        JOptionPane.showOptionDialog(
            null,
            "You are awesome!",
            "secret message",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            icon,
            responses,
            0
        );
    }
}

package io.zentae.fx.frame;

import io.zentae.fx.panel.MenuPanel;

import javax.swing.*;

public class MenuFrame extends JFrame {

    public static void main(String[] args) {
        new MenuFrame();
    }

    public MenuFrame() {
        add(new MenuPanel());
        // set the title.
        setTitle("Snake Blockade | Menu");
        // set the size
        setSize(800, 800);
        // state that if we hit the red button the program closes.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // center the frame.
        setLocationRelativeTo(null);
        // avoid problems lol.
        setResizable(false);
        // show the frame.
        setVisible(true);
    }
}

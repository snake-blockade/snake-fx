package io.zentae.fx.panel;

import io.zentae.fx.listener.A;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    public MenuPanel() {
        // create button.
        JButton ia = new JButton("IA");
        JButton opponent = new JButton("Adversaire");
        JButton playerOne = new JButton("Joueur 1");
        playerOne.setVisible(false);
        JButton playerTwo = new JButton("Joueur 2");
        playerTwo.setVisible(false);
        ia.addActionListener(new A(this));
        // register the buttons.
        add(ia);
        add(opponent);
        add(playerOne);
        add(playerTwo);
        // set the layout.
        setLayout(new GridBagLayout());
        // set the panel visible.
        setVisible(true);
    }
}

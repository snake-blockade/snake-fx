package io.zentae.fx.panel;

import io.zentae.fx.listener.AIButtonListener;
import io.zentae.fx.listener.LANButtonListener;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends AbstractPanel {

    public MenuPanel() {
        // create button.
        JButton ia = new JButton("IA");
        ia.setName("ai");
        JButton lan = new JButton("LAN");
        lan.setName("lan");
        JButton opponent = new JButton("Adversaire");
        opponent.setName("opponent");
        // ia sub-menu buttons.
        JButton playerOneIA = new JButton("Joueur 1 (IA)");
        playerOneIA.setName("player-1-ai");
        playerOneIA.setVisible(false);
        JButton playerTwoIA = new JButton("Joueur 2 (IA)");
        playerTwoIA.setName("player-2-ai");
        playerTwoIA.setVisible(false);
        // LAN sub-menu buttons.
        JButton playerOneLAN = new JButton("Joueur 1 (LAN)");
        playerOneLAN.setName("player-1-lan");
        playerOneLAN.setVisible(false);
        JButton playerTwoLAN = new JButton("Joueur 2 (LAN)");
        playerTwoLAN.setName("player-2-lan");
        playerTwoLAN.setVisible(false);
        // listen for button click.
        ia.addActionListener(new AIButtonListener(this));
        lan.addActionListener(new LANButtonListener(this));
        // register the buttons.
        add(ia);
        add(lan);
        add(opponent);
        // register ia buttons.
        add(playerOneIA);
        add(playerTwoIA);
        // register opponent buttons.
        add(playerOneLAN);
        add(playerTwoLAN);
        // set the layout.
        setLayout(new GridBagLayout());
        // set the panel visible.
        setVisible(true);
    }

}

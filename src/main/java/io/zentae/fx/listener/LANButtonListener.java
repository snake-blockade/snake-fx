package io.zentae.fx.listener;

import io.zentae.fx.panel.AbstractPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LANButtonListener implements ActionListener {

    private final AbstractPanel panel;

    public LANButtonListener(AbstractPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.getComponent( "opponent").setVisible(false);
        panel.getComponent( "ai").setVisible(false);
        panel.getComponent("lan").setVisible(false);
        panel.getComponent( "player-1-lan").setVisible(true);
        panel.getComponent( "player-2-lan").setVisible(true);
    }
}

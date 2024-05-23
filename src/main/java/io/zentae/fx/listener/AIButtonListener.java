package io.zentae.fx.listener;

import io.zentae.fx.panel.AbstractPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AIButtonListener implements ActionListener {

    private final AbstractPanel panel;

    public AIButtonListener(AbstractPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        panel.getComponent( "opponent").setVisible(false);
        panel.getComponent( "ai").setVisible(false);
        panel.getComponent("lan").setVisible(false);
        panel.getComponent( "player-1-ai").setVisible(true);
        panel.getComponent( "player-2-ai").setVisible(true);
    }
}

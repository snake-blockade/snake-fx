package io.zentae.fx.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpponentButtonListener implements ActionListener {

    private final JPanel panel;

    public OpponentButtonListener(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.getComponent( 0).setVisible(false);
        panel.getComponent( 1).setVisible(false);
        panel.getComponent( 4).setVisible(true);
        panel.getComponent( 5).setVisible(true);
    }
}

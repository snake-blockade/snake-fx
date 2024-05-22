package io.zentae.fx.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A implements ActionListener {

    private final JPanel panel;

    public A(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        panel.getComponent( 0).setVisible(false);
        panel.getComponent( 1).setVisible(false);
        panel.getComponent( 2).setVisible(true);
        panel.getComponent( 3).setVisible(true);
    }
}

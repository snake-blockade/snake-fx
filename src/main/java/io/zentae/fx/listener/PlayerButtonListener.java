package io.zentae.fx.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerButtonListener implements ActionListener {

    private final Runnable runnable;

    public PlayerButtonListener(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        ((JComponent)event.getSource()).getParent().setVisible(false);
        runnable.run();
    }
}

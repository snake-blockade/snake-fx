package io.zentae.fx.frame;

import io.zentae.fx.panel.AbstractPanel;

import javax.swing.*;

public abstract class AbstractFrame extends JFrame {

    private final AbstractPanel panel;
    public AbstractFrame(AbstractPanel panel) {
        this.panel = panel;
    }

    /**
     * Opens the current frame.
     */
    public void open() {
        super.setVisible(true);
    }

    public AbstractPanel getPanel() {
        return this.panel;
    }

}

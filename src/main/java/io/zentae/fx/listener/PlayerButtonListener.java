package io.zentae.fx.listener;

import io.zentae.fx.frame.AbstractFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;

public class PlayerButtonListener implements ActionListener {

    private final Consumer<ActionEvent> consumer;
    private final AbstractFrame abstractFrame;
    public PlayerButtonListener(AbstractFrame abstractFrame, Consumer<ActionEvent> consumer) {
        this.abstractFrame = abstractFrame;
        this.consumer = consumer;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // close the frame.
        this.abstractFrame.dispose();
        // callback.
        consumer.accept(event);
    }
}

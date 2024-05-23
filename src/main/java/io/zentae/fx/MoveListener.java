package io.zentae.fx;

import io.zentae.snake.engine.event.snake.SnakeMoveEvent;
import io.zentae.snake.engine.listener.Listener;

import javax.swing.*;

public class MoveListener extends Listener<SnakeMoveEvent> {

    private final JFrame frame;

    public MoveListener(JFrame frame) {
        super(SnakeMoveEvent.class);
        this.frame = frame;
    }

    @Override
    protected void onListen(SnakeMoveEvent event) {
        // repaint.
        frame.repaint();
    }
}

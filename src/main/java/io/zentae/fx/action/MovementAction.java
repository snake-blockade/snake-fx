package io.zentae.fx.action;

import io.zentae.snake.engine.GameEngine;
import io.zentae.snake.engine.movement.Movement;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MovementAction extends AbstractAction {

    // the movement performed.
    private final Movement movement;

    public MovementAction(Movement movement) {
        this.movement = movement;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        GameEngine.play(this.movement, true);
    }
}

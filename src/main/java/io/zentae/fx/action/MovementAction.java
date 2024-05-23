package io.zentae.fx.action;

import io.zentae.snake.engine.controller.game.GameController;
import io.zentae.snake.engine.movement.Movement;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MovementAction extends AbstractAction {

    // the game controller.
    private final GameController controller;
    // the movement performed.
    private final Movement movement;

    public MovementAction(GameController controller, Movement movement) {
        this.controller = controller;
        this.movement = movement;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        controller.next(movement);
    }
}

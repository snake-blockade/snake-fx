package io.zentae.fx.panel;

import io.zentae.fx.action.MovementAction;
import io.zentae.renderer.Renderer;
import io.zentae.renderer.Translator;
import io.zentae.renderer.layer.DefaultTranslationLayer;
import io.zentae.snake.engine.controller.game.GameController;
import io.zentae.snake.engine.entity.arena.Arena;
import io.zentae.snake.engine.movement.Movement;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends AbstractPanel {

    private static final Color BACKGROUND_COLOR = new Color(115, 162, 78);
    // the arena.
    private final Arena arena;

    public GamePanel(GameController controller) {
        this.arena = controller.getGame().getArena();
        // map the inputs.
        getInputMap().put(KeyStroke.getKeyStroke("UP"), "movement_up");
        getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "movement_down");
        getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "movement_left");
        getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "movement_right");
        // map the actions.
        getActionMap().put("movement_up", new MovementAction(Movement.UP));
        getActionMap().put("movement_down", new MovementAction(Movement.DOWN));
        getActionMap().put("movement_left", new MovementAction(Movement.LEFT));
        getActionMap().put("movement_right", new MovementAction(Movement.RIGHT));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // set background color.
        setBackground(BACKGROUND_COLOR);
        // translate.
        // render.
        Translator.getTranslationLayer(DefaultTranslationLayer.class)
                .translate(this.arena)
                .forEach((key, value) -> Renderer.render(value, g, key));
    }
}

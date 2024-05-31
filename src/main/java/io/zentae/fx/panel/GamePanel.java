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

    private static final Color BACKGROUND_COLOR = new Color(162, 209, 72);
    private static final Color BACKGROUND_COLOR_ALTERNATE = new Color(170, 215, 80);
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
        // the alternator.
        boolean alternate = true;
        // the offset.
        int offset = 0;
        // set the graphics color.
        g.setColor(BACKGROUND_COLOR_ALTERNATE);
        // make squares.
        for(int y = 0; y < getHeight(); y += 40) {
            for(int x = 0; x < getWidth(); x += 40) {
                // check if we should alternate.
                if(alternate) {
                    g.drawRect(x + offset, y, 40, 40);
                    g.fillRect(x + offset, y, 40, 40);
                }
                // invert the value.
                alternate = !alternate;
            }
            offset = offset == 40 ? 0 : 40;
        }
        // translate.
        // render.
        Translator.getTranslationLayer(DefaultTranslationLayer.class)
                .translate(this.arena)
                .forEach((key, value) -> Renderer.render(value, g, key));
    }
}

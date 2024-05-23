package io.zentae.fx.frame;

import io.zentae.fx.panel.DeathPanel;
import io.zentae.snake.engine.controller.game.GameController;

import javax.swing.*;

public class DeathFrame extends AbstractFrame {

    public DeathFrame(GameController controller) {
        super(new DeathPanel(controller));
        // create the game panel.
        add(super.getPanel());
        // set the title.
        setTitle("Snake Blockade | Mort !");
        // set the window size.
        setSize(480, 905);
        // state that if we hit the red button the program closes.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // center the frame.
        setLocationRelativeTo(null);
        // avoid problems lol.
        setResizable(false);
    }
}

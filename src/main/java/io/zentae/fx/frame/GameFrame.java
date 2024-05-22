package io.zentae.fx.frame;

import io.zentae.fx.panel.GamePanel;
import io.zentae.snake.engine.controller.game.GameController;

import javax.swing.*;

public class GameFrame extends JFrame {

    public GameFrame(GameController controller) {
        // create the game panel.
        add(new GamePanel(controller));
        // set the title.
        setTitle("Snake Blockade | Jeu");
        // set the window size.
        setSize(480, 905);
        // state that if we hit the red button the program closes.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // center the frame.
        setLocationRelativeTo(null);
        // avoid problems lol.
        setResizable(false);
        // show the frame.
        setVisible(true);
    }
}

package io.zentae.fx.panel;

import io.zentae.fx.GameEndEventListener;
import io.zentae.fx.MoveListener;
import io.zentae.fx.SnakeEngine;
import io.zentae.fx.frame.GameFrame;
import io.zentae.fx.listener.IAButtonListener;
import io.zentae.fx.listener.OpponentButtonListener;
import io.zentae.fx.listener.PlayerButtonListener;
import io.zentae.snake.engine.controller.game.GameController;
import io.zentae.snake.engine.event.EventBus;
import io.zentae.snake.engine.event.GameEndEvent;
import io.zentae.snake.engine.event.snake.SnakeMoveEvent;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {

    public MenuPanel() {
        // create button.
        JButton ia = new JButton("IA");
        JButton opponent = new JButton("Adversaire");
        // ia sub-menu buttons.
        JButton playerOneIA = new JButton("Joueur 1 (IA)");
        playerOneIA.setVisible(false);
        JButton playerTwoIA = new JButton("Joueur 2 (IA)");
        playerTwoIA.setVisible(false);
        // opponent sub-menu buttons.
        JButton playerOneOpponent = new JButton("Joueur 1 (Adversaire)");
        playerOneOpponent.setVisible(false);
        JButton playerTwoOpponent = new JButton("Joueur 2 (Adversaire)");
        playerTwoOpponent.setVisible(false);
        // listen for button click.
        ia.addActionListener(new IAButtonListener(this));
        opponent.addActionListener(new OpponentButtonListener(this));
        // listen for the player related button.
        playerOneOpponent.addActionListener(new PlayerButtonListener(() -> {
            SnakeEngine engine = new SnakeEngine();
            GameController gameController = engine.gameController;
            GameFrame frame = new GameFrame(gameController);
            EventBus.subscribe(GameEndEvent.class, new GameEndEventListener());
            EventBus.subscribe(SnakeMoveEvent.class, new MoveListener(frame));
        }));
        // register the buttons.
        add(ia);
        add(opponent);
        // register ia buttons.
        add(playerOneIA);
        add(playerTwoIA);
        // register opponent buttons.
        add(playerOneOpponent);
        add(playerTwoOpponent);
        // set the layout.
        setLayout(new GridBagLayout());
        // set the panel visible.
        setVisible(true);
    }
}

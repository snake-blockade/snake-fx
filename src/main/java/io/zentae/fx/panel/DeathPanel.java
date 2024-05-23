package io.zentae.fx.panel;

import io.zentae.snake.engine.controller.game.DeathType;
import io.zentae.snake.engine.controller.game.GameController;

import javax.swing.*;
import java.awt.*;

public class DeathPanel extends AbstractPanel {

    public DeathPanel(GameController controller) {
        // set background.
        setBackground(new Color(14, 14, 14));
        // set text at the top to notify the player's death.
        JLabel deathText = new JLabel("PERDU");
        deathText.setForeground(new Color(192, 16, 16));
        deathText.setFont(new Font("Serif", Font.PLAIN, 50));
        deathText.setVisible(true);
        add(deathText);
        // check if there is a death reason.
        if(controller.getDeathType() != null && controller.getDeathType() != DeathType.NONE) {
            // ONLY if there is a death reason, add it.
            JLabel reasonText = new JLabel(controller.getDeathType().getMessage());
            reasonText.setForeground(new Color(211, 197, 197));
            reasonText.setFont(new Font("Serif", Font.PLAIN, 30));
            reasonText.setVisible(true);
            // register the component.
            add(reasonText);
        }
    }
}

package io.zentae.fx.component;

import io.zentae.snake.engine.entity.Location;

import java.awt.*;

public class ObstacleComponent extends RelativeComponent {

    public ObstacleComponent(Location location, int width, int height) {
        this(location.getX(), location.getY(), width, height);
    }

    public ObstacleComponent(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // set red color.
        g.setColor(Color.GRAY);
        g.drawRect(getX(), getY(), getWidth(), getHeight());
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }
}

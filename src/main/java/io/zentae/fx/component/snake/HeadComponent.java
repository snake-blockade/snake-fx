package io.zentae.fx.component.snake;

import io.zentae.fx.component.RelativeComponent;
import io.zentae.snake.engine.entity.Location;

import java.awt.*;

public class HeadComponent extends RelativeComponent {

    public HeadComponent(Location location, int width, int height) {
        this(location.getX(), location.getY(), width, height);
    }

    public HeadComponent(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // set red color.
        g.setColor(Color.RED);
        g.drawRect(getX(), getY(), getWidth(), getHeight());
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }
}

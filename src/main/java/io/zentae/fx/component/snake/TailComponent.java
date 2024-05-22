package io.zentae.fx.component.snake;

import io.zentae.fx.component.RelativeComponent;
import io.zentae.snake.engine.entity.Location;

import java.awt.*;

public class TailComponent extends RelativeComponent {

    public TailComponent(Location location, int width, int height) {
        this(location.getX(), location.getY(), width, height);
    }

    public TailComponent(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // set red color.
        g.setColor(Color.BLACK);
        g.drawRect(getX(), getY(), getWidth(), getHeight());
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }
}

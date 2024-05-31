package io.zentae.fx.component;

import io.zentae.snake.engine.entity.Location;

import java.awt.*;
import java.awt.image.BufferedImage;

public class DefaultImageComponent extends ImageComponent {

    public DefaultImageComponent(BufferedImage image, int x, int y) {
        this(image, x, y, image.getWidth(), image.getHeight());
    }

    public DefaultImageComponent(BufferedImage image, Location location) {
        this(image, location.getX(), location.getY());
    }

    public DefaultImageComponent(BufferedImage image, Location location, int width, int height) {
        this(image, location.getX(), location.getY(), width, height);
    }

    public DefaultImageComponent(BufferedImage image, int x, int y, int width, int height) {
        super(image, x, y, width, height);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // draw the head.
        g.drawImage(getImage(), getX(), getY(), getWidth(), getHeight(), null);
    }
}

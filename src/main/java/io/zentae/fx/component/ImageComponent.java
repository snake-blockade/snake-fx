package io.zentae.fx.component;

import jakarta.annotation.Nonnull;

import java.awt.image.BufferedImage;

public abstract class ImageComponent extends RelativeComponent {

    // the image.
    private final BufferedImage image;

    public ImageComponent(@Nonnull BufferedImage image, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.image = image;
    }

    protected BufferedImage getImage() {
        return this.image;
    }
}

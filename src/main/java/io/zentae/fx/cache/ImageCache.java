package io.zentae.fx.cache;

import io.zentae.contentlibrary.cache.PairedBucket;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageCache extends PairedBucket<String, BufferedImage> {

    public ImageCache() {
        try {
            // register the head.
            register("head_up", ImageIO.read(getClass().getResource("/head_up.png")));
            register("head_down", ImageIO.read(getClass().getResource("/head_down.png")));
            register("head_left", ImageIO.read(getClass().getResource("/head_left.png")));
            register("head_right", ImageIO.read(getClass().getResource("/head_right.png")));
            // the tail.
            register("tail_up", ImageIO.read(getClass().getResource("/tail_up.png")));
            register("tail_down", ImageIO.read(getClass().getResource("/tail_down.png")));
            register("tail_left", ImageIO.read(getClass().getResource("/tail_left.png")));
            register("tail_right", ImageIO.read(getClass().getResource("/tail_right.png")));
            // the apple.
            register("apple", ImageIO.read(getClass().getResource("/apple.png")));
            // the body parts.
            register("body_top_left", ImageIO.read(getClass().getResource("/body_top_left.png")));
            register("body_vertical", ImageIO.read(getClass().getResource("/body_vertical.png")));
            register("body_top_right", ImageIO.read(getClass().getResource("/body_top_right.png")));
            register("body_horizontal", ImageIO.read(getClass().getResource("/body_horizontal.png")));
            register("body_bottom_left", ImageIO.read(getClass().getResource("/body_bottom_left.png")));
            register("body_bottom_right", ImageIO.read(getClass().getResource("/body_bottom_right.png")));
        } catch (IOException exception) {
            System.out.printf("An error occurred while loading the resources: %s%n", exception.getMessage());
        }
    }
}

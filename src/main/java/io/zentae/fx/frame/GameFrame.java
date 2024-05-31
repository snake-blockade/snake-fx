package io.zentae.fx.frame;

import io.zentae.fx.cache.ImageCache;
import io.zentae.fx.component.DefaultImageComponent;
import io.zentae.fx.component.ObstacleComponent;
import io.zentae.fx.panel.GamePanel;
import io.zentae.renderer.Renderer;
import io.zentae.snake.engine.controller.game.GameController;

import javax.swing.*;

public class GameFrame extends AbstractFrame {

    public GameFrame(GameController controller, ImageCache imageCache) {
        super(new GamePanel(controller));
        // create the game panel.
        add(super.getPanel());
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
        // map components.
        Renderer.register("head_up", ((graphics, location) ->
                new DefaultImageComponent(imageCache.of("head_up"), location).paintComponent(graphics)));
        Renderer.register("head_down", ((graphics, location) ->
                new DefaultImageComponent(imageCache.of("head_down"), location).paintComponent(graphics)));
        Renderer.register("head_left", ((graphics, location) ->
                new DefaultImageComponent(imageCache.of("head_left"), location).paintComponent(graphics)));
        Renderer.register("head_right", ((graphics, location) ->
                new DefaultImageComponent(imageCache.of("head_right"), location).paintComponent(graphics)));
        // the tail.
        Renderer.register("tail_up", ((graphics, location) ->
                new DefaultImageComponent(imageCache.of("tail_up"), location).paintComponent(graphics)));
        Renderer.register("tail_down", ((graphics, location) ->
                new DefaultImageComponent(imageCache.of("tail_down"), location).paintComponent(graphics)));
        Renderer.register("tail_left", ((graphics, location) ->
                new DefaultImageComponent(imageCache.of("tail_left"), location).paintComponent(graphics)));
        Renderer.register("tail_right", ((graphics, location) ->
                new DefaultImageComponent(imageCache.of("tail_right"), location).paintComponent(graphics)));
        // the body.
        Renderer.register("body_horizontal", ((graphics, location) ->
                new DefaultImageComponent(imageCache.of("body_horizontal"), location).paintComponent(graphics)));
        Renderer.register("body_vertical", ((graphics, location) ->
                new DefaultImageComponent(imageCache.of("body_vertical"), location).paintComponent(graphics)));
        Renderer.register("body_bottom_left", ((graphics, location) ->
                new DefaultImageComponent(imageCache.of("body_bottom_left"), location).paintComponent(graphics)));
        Renderer.register("body_bottom_right", ((graphics, location) ->
                new DefaultImageComponent(imageCache.of("body_bottom_right"), location).paintComponent(graphics)));
        Renderer.register("body_top_left", ((graphics, location) ->
                new DefaultImageComponent(imageCache.of("body_top_left"), location).paintComponent(graphics)));
        Renderer.register("body_top_right", ((graphics, location) ->
                new DefaultImageComponent(imageCache.of("body_top_right"), location).paintComponent(graphics)));
        Renderer.register("apple", ((graphics, location) ->
                new DefaultImageComponent(imageCache.of("apple"), location).paintComponent(graphics)));
        Renderer.register("obstacle", ((graphics, location) ->
                new ObstacleComponent(location, 40, 40).paintComponent(graphics)));
        Renderer.register(" ", ((graphics, location) -> {}));
        Renderer.register("X", ((graphics, location) -> {}));
    }
}

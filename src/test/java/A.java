import io.zentae.fx.component.FruitComponent;
import io.zentae.fx.component.ObstacleComponent;
import io.zentae.fx.component.snake.BodyComponent;
import io.zentae.fx.component.snake.HeadComponent;
import io.zentae.fx.component.snake.TailComponent;
import io.zentae.fx.frame.MenuFrame;
import io.zentae.renderer.Renderer;
import io.zentae.renderer.Translator;
import io.zentae.renderer.layer.DefaultTranslationLayer;
import io.zentae.snake.engine.entity.fruit.Fruit;
import io.zentae.snake.engine.entity.obstacle.Obstacle;
import io.zentae.snake.engine.entity.snake.Snake;

import java.util.HashMap;
import java.util.Map;

public class A {

    public static void main(String[] args) {
        // register translation.
        Renderer.register('H', ((graphics, location) ->
                new HeadComponent(location, 40, 40).paintComponent(graphics)));
        Renderer.register('O', ((graphics, location) ->
                new BodyComponent(location, 40, 40).paintComponent(graphics)));
        Renderer.register('T', ((graphics, location) ->
                new TailComponent(location, 40, 40).paintComponent(graphics)));
        Renderer.register('A', ((graphics, location) ->
                new FruitComponent(location, 40, 40).paintComponent(graphics)));
        Renderer.register('P', ((graphics, location) ->
                new ObstacleComponent(location, 40, 40).paintComponent(graphics)));
        Renderer.register(' ', ((graphics, location) -> {}));
        Renderer.register('X', ((graphics, location) -> {}));
        // map the class.
        Map<Class<?>, Character> map = new HashMap<>();
        map.put(Snake.class, 'O');
        map.put(Fruit.class, 'A');
        map.put(Obstacle.class, 'P');
        Translator.register(new DefaultTranslationLayer(40, map));
        // display the menu frame.
        MenuFrame menuFrame = new MenuFrame();
    }
}

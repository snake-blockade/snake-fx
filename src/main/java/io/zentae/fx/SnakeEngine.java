package io.zentae.fx;

import io.zentae.snake.engine.controller.game.DefaultGameController;
import io.zentae.snake.engine.controller.game.GameController;
import io.zentae.snake.engine.controller.snake.DefaultSnakeController;
import io.zentae.snake.engine.entity.Location;
import io.zentae.snake.engine.entity.arena.Arena;
import io.zentae.snake.engine.entity.game.DefaultGame;
import io.zentae.snake.engine.entity.game.Game;
import io.zentae.snake.engine.entity.player.DefaultPlayer;
import io.zentae.snake.engine.entity.player.Player;
import io.zentae.snake.engine.entity.snake.Snake;
import io.zentae.snake.engine.factory.arena.ArenaFactory;
import io.zentae.snake.engine.factory.arena.LinearArenaFactory;
import io.zentae.snake.engine.factory.snake.DefaultSnakeFactory;
import io.zentae.snake.engine.factory.snake.SnakeFactory;
import io.zentae.snake.engine.listener.CollisionListener;
import io.zentae.snake.engine.listener.SnakeGrowListener;

import java.util.ArrayList;
import java.util.List;

public class SnakeEngine {

    public GameController gameController;

    public SnakeEngine() {
        new SnakeGrowListener();
        new CollisionListener();
        SnakeFactory snakeFactory = new DefaultSnakeFactory();
        ArenaFactory arenaFactory = new LinearArenaFactory();
        List<Snake> snakes = new ArrayList<>();
        snakes.add(snakeFactory.create(new Location(2, 2)));
        snakes.add(snakeFactory.create(new Location(9, 19)));
        Arena arena = arenaFactory.create(snakes, 12, 22);
        List<Player> players = new ArrayList<>();
        Game game = new DefaultGame(arena, players, 4);
        for(Snake snake : snakes)
            players.add(new DefaultPlayer(new DefaultSnakeController(snake)));
        this.gameController = new DefaultGameController(game);
        /*ScheduledExecutorService service = Executors.newScheduledThreadPool(0);
        service.scheduleAtFixedRate(() -> {
            try {
                if(gameController.getGame().getGameState() == GameState.END) {
                    service.shutdown();
                    return;
                }
                for(Player player : gameController.getGame().getPlayers()) {
                    Movement movement = Movement.values()[ThreadLocalRandom.current().nextInt(Movement.values().length)];
                    System.out.println(movement);
                    gameController.next(movement, player);
                }
                //render(arena);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }, 0L, 1L, TimeUnit.SECONDS); */
    }
}

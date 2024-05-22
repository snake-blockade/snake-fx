import io.zentae.snake.engine.event.GameEndEvent;
import io.zentae.snake.engine.listener.Listener;

public class GameEndEventListener extends Listener<GameEndEvent> {

    public GameEndEventListener() {
        super(GameEndEvent.class);
    }

    @Override
    protected void onListen(GameEndEvent event) {
        System.exit(0);
    }
}

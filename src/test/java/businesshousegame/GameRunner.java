package businesshousegame;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GameRunner {
    @Test
    public void gameShouldBeRun() {
        List<Player> players = new ArrayList<>();
        Board board = new Board();
        Player player1 = new Player();
        Player player2 = new Player();
        players.add(player1);
        players.add(player2);
        Game game = new Game(board,players);
        while (game.isRunning()){
            game.play();
        }
    }
}

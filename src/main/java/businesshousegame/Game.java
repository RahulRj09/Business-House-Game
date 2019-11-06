package businesshousegame;

import java.util.List;

public class Game {
    private int currentPlayerIndex;
    private int chances;
    private Board board;
    private List<Player> players;

    public Game(Board board, List<Player> players) {
        this.board = board;
        this.players = players;
        this.chances = players.size() * 10;
        this.currentPlayerIndex = 0;
    }

    public boolean isRunning() {
        if (chances == 0) {
            return false;
        }
        return true;
    }

    public void play() {
        Player currentPlayer = players.get(currentPlayerIndex);
        moveAPlayer(currentPlayer);
        System.out.println(currentPlayer.getPosition());
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }

    private void moveAPlayer(Player currentPlayer) {
        chances -= 1;
        int numberOnDice = board.rollDice();
        int position = currentPlayer.getPosition();
        if (position + numberOnDice > position) {
            currentPlayer.setPosition(position % numberOnDice);
        }
        currentPlayer.setPosition(numberOnDice);
    }
}

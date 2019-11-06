package businesshousegame;

import java.util.Random;

public class Board {
    public int rollDice() {
        return new Random().nextInt(9) + 4;
    }
}

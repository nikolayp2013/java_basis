package examples;

public class Game {

    private GameLevel gameLevel;

    public Game() {

    }

    public Game(GameLevel gameLevel) {
        this.gameLevel = gameLevel;
    }

    public GameLevel getGameLevel() {
        return gameLevel;
    }

    public void setGameLevel(GameLevel gameLevel) {
        this.gameLevel = gameLevel;
    }

    public GameLevel getDefaultLevel() {
        return GameLevel.BEGINNER;
    }
}

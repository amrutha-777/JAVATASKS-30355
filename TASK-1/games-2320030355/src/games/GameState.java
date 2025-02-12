package games;

public class GameState {
	private static GameState instance;
    private int level = 1;
    private int score = 0;

    private GameState() {}

    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void addScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }
}

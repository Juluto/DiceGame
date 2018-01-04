package m2.miage.dicegame.modele;

public class HighScore {

    private int score;

    public HighScore() {
        this.score = 0;
    }

    public void add(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

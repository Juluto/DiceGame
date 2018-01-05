package m2.miage.dicegame.modele;

public class HighScore {

    private int score;
    private String namePlayer;

    public HighScore() {
        this.score = 0;
        this.namePlayer = "";
    }

    public void add(int score, String name) {
        this.score = score;
        this.namePlayer = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }
}

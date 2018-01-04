package m2.miage.dicegame.modele;

public class DiceGame {

    private Player player;
    private Die die1;
    private Die die2;
    private int score;
    private int nbLancer;

    public DiceGame(Player player) {
        this.player = player;
        Die die1 = new Die();
        Die die2 = new Die();
        this.score = 0;
        this.nbLancer = 0;
    }

    public void start() {

    }
}

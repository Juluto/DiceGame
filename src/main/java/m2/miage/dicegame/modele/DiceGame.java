package m2.miage.dicegame.modele;

public class DiceGame {

    private Player player;
    private Die die1;
    private Die die2;
    private int nbLancer;

    public DiceGame() {

    }

    public void start(String player) {
        this.player = new Player(player);
        this.die1 = new Die();
        this.die2 = new Die();
        this.nbLancer = 0;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Die getDie1() {
        return die1;
    }

    public void setDie1(Die die1) {
        this.die1 = die1;
    }

    public Die getDie2() {
        return die2;
    }

    public void setDie2(Die die2) {
        this.die2 = die2;
    }

    public int getNbLancer() {
        return nbLancer;
    }

    public void setNbLancer(int nbLancer) {
        this.nbLancer = nbLancer;
    }
}

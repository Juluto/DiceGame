package m2.miage.dicegame.Factory;

import m2.miage.dicegame.Product.HighScoreJDBC;
import m2.miage.dicegame.modele.HighScore;

public class jdbcKit extends PersistKit {

    public jdbcKit() {
        pk = this;
    }

    public HighScore makeKit() {
        return new HighScoreJDBC();
    }
}

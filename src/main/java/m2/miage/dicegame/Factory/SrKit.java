package m2.miage.dicegame.Factory;

import m2.miage.dicegame.Product.HighScoreSr;
import m2.miage.dicegame.modele.HighScore;

public class SrKit extends PersistKit {

    @Override
    public HighScore makeKit() {
        return new HighScoreSr();
    }

    public SrKit() {
        pk = this;
    }
}

package m2.miage.dicegame.Factory;

//import main.java.Product.HighScore;

import m2.miage.dicegame.modele.HighScore;

public abstract class PersistKit {

    protected static PersistKit pk = null;

    protected PersistKit() {

    }

    public static PersistKit getInstance() {
        if (pk == null) {
            new Error("No Persist declared");
        }
        return pk;
    }

    public abstract HighScore makeKit();

}

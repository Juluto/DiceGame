package m2.miage.dicegame.modele;

import java.util.Enumeration;
import java.util.Observable;
import java.util.Vector;

public abstract class HighScore extends Observable {

    protected static HighScore hs = null;
    public Vector entries = new Vector();

    protected HighScore() {

    }

    /*public HighScore() {
        this.score = 0;
        this.namePlayer = "";
    }*/

    public void add(Entry entry) {
        entries.addElement(entry);
        this.setChanged();
        this.notifyObservers();
    }

    public Enumeration elements() {
        return entries.elements();
    }

    public abstract void load();

    public abstract void save();

    public static HighScore getInstance() {
        if (hs == null) {
            new Error("No Persist Kit declared");
        }
        return hs;
    }
}

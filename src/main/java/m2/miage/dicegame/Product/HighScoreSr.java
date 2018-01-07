package m2.miage.dicegame.Product;

import m2.miage.dicegame.modele.HighScore;

import java.io.*;

public class HighScoreSr extends HighScore {

    String filename = "C:/tmp/high.score";

    public HighScoreSr() {
        load();
    }

    public void save() {
        try {
            FileOutputStream ostream = new FileOutputStream(filename);
            ObjectOutputStream p = new ObjectOutputStream(ostream);

            p.writeObject(this);
            p.flush();
            ostream.close();
        } catch (Exception e) {
            e.printStackTrace();
            new Error("Error while saving HighScore...");
        }
    }

    public void load() {
        try {
            FileInputStream istream = new FileInputStream(filename);
            ObjectInputStream q = new ObjectInputStream(istream);

            hs = (HighScoreSr) q.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No file : " + filename + " found");
            hs = this;
        }
        catch (Exception e) {
            e.printStackTrace();
            new Error("Error while saving HighScore...");
        }
    }
}

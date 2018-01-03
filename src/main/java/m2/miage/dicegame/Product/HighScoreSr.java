package m2.miage.dicegame.Product;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HighScoreSr {

    String filename = "";
    public void save() throws Exception {
        FileOutputStream ostream = new FileOutputStream(filename);
        ObjectOutputStream p = new ObjectOutputStream(ostream);
        p.writeObject(this);
        p.flush();
        ostream.close();
    }

    public void load() throws Exception {
        FileInputStream istream = new FileInputStream(filename);
        ObjectInputStream q = new ObjectInputStream(istream);

        HighScoreSr hsr = (HighScoreSr) q.readObject();
    }
}

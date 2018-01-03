package m2.miage.dicegame.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;

public class HighScoreJDBC extends HighScore {
    public static final String url = "jdbc:odbc:dice";
    Connection con = null;

    public HighScoreJDBC() {
        try {
            //charge le driver JDBC
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection(url, "toto", "");
        } catch (Exception e) {
            e.printStackTrace();
            new Error("Cannot access Database at" + url);
        }
        //hs = this; // enregistrement de l’instance unique!
        this.load();
    }

    public void add() {

    }

    public void save() {
        try {
            /*for (Enumeration e = this.elements(); e.hasMoreElements(); ) {
                Entry entry = (Entry) e.nextElement();
                Statement s = con.createStatement();
                s.executeUpdate("INSERT INTO HighScore (Name,Score)" + "VALUES('" + entry.getName() + "'," + entry.getScore() + ")");
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void load() {
        try {
            Statement select = con.createStatement();
            ResultSet result = select.executeQuery("SELECT Name,Score FROM HighScore");
            /*while (result.next()) {
                this.add(new Entry(result.getString(1), result.getInt(2)));
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void WhoTheHellAreYou() {
        System.out.println("You don't need to know but you");
    }
}

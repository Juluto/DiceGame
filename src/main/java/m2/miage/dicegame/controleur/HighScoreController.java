package m2.miage.dicegame.controleur;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import m2.miage.dicegame.Main.Main;
import m2.miage.dicegame.modele.HighScore;

import java.net.URL;
import java.util.ResourceBundle;

public class HighScoreController implements Initializable {

    private Main apps;
    private static HighScore highScore = new HighScore();

    @FXML
    private Pane paneHighScore;
    @FXML
    private Text textHighScore;
    @FXML
    private Text textHighScorePlayer;
    @FXML
    private Button buttonHighScoreRetour;

    public HighScoreController() {
        super();
    }

    public void setView(Application apps) {
        this.apps = (Main) apps;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        textHighScore.setText(Integer.toString(highScore.getScore()));
        textHighScorePlayer.setText(highScore.getNamePlayer());
    }

    @FXML
    public void setRetour(ActionEvent event) {
        apps.menuView();
    }

    public static HighScore getHighScore() {
        return highScore;
    }

    public static void setHighScore(HighScore highScore) {
        HighScoreController.highScore = highScore;
    }
}

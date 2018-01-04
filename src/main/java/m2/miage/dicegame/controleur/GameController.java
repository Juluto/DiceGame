package m2.miage.dicegame.controleur;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import m2.miage.dicegame.Main.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    private Main apps;

    @FXML
    private Pane paneJouer;
    @FXML
    private Text textDe1;
    @FXML
    private Text textDe2;
    @FXML
    private Text textLancer;
    @FXML
    private Text textScore;
    @FXML
    private Button buttonLancer;
    @FXML
    private Button buttonJouerQuitter;

    public GameController() {
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
        textDe1.setText("0");
        textDe2.setText("0");
        textLancer.setText("0");
        textScore.setText("0");
    }

    public static void launchGame(){


    }
}

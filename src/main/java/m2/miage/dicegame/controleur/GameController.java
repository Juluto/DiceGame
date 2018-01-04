package m2.miage.dicegame.controleur;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {

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

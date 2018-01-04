package m2.miage.dicegame.controleur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HighScoreController implements Initializable {

    @FXML
    private Pane paneHighScore;
    @FXML
    private Text textHighScore;
    @FXML
    private Button buttonHighScoreRetour;

    public HighScoreController() {
        super();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void setRetour(ActionEvent event) {

    }
}

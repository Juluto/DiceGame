package m2.miage.dicegame.controleur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import m2.miage.dicegame.Main.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    private Main apps;

    @FXML
    private Pane paneMenu;
    @FXML
    private Button buttonJouer;
    @FXML
    private Button buttonHighScore;
    @FXML
    private Button buttonParametres;

    public MenuController() {
        super();
    }

    public void setView(Main main) {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    public void setJouer(ActionEvent event) {

    }

    @FXML
    public void setHighScore(ActionEvent event) {
        //paneHighScore.toFront();
    }

    @FXML
    public void setParametres(ActionEvent event) {
        //paneParametres.toFront();
    }

}

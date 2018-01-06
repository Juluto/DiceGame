package m2.miage.dicegame.controleur;

import javafx.application.Application;
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
    @FXML
    private Button buttonScore;

    public MenuController() {
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
    }

    @FXML
    public void setJouer(ActionEvent event) {
        apps.gameView();
    }

    @FXML
    public void setHighScore(ActionEvent event) {
        apps.highScoreView();
    }

    @FXML
    public void setParametres(ActionEvent event) {
        apps.parametersView();
    }

    @FXML
    public void setScore(ActionEvent event) {
        apps.scoreView();
    }

}

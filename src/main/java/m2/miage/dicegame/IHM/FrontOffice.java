package m2.miage.dicegame.IHM;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import m2.miage.dicegame.Main.Main;
import m2.miage.dicegame.controleur.GameController;
import m2.miage.dicegame.controleur.ParameterController;

import java.net.URL;
import java.util.ResourceBundle;

public class FrontOffice implements Initializable {

    private int highScore = 0;

    @FXML
    private Pane paneMenu;
    @FXML
    private Button buttonJouer;
    @FXML
    private Button buttonHighScore;
    @FXML
    private Button buttonParametres;
    @FXML
    private Pane paneParametres;
    @FXML
    private TextField TFParametresPseudo;
    @FXML
    private ComboBox<String> CBParametresEnregistrement;
    @FXML
    private Button buttonParametresValider;
    @FXML
    private Button buttonParametresAnnuler;
    @FXML
    private Pane paneHighScore;
    @FXML
    private Text textHighScore;
    @FXML
    private Button buttonHighScoreRetour;
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

    public void setMain(Main main) {

    }

    public FrontOffice() {
        super();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CBParametresEnregistrement.getItems().removeAll(CBParametresEnregistrement.getItems());
        CBParametresEnregistrement.getItems().addAll("XML", "JSON");
        CBParametresEnregistrement.getSelectionModel().select("XML");

        TFParametresPseudo.setText("Player");

        textHighScore.setText(Integer.toString(highScore));

        textDe1.setText("0");
        textDe2.setText("0");
        textLancer.setText("0");
        textScore.setText("0");
    }

    @FXML
    public void setFrontPaneMenu(ActionEvent event) {
        /*CBParametresEnregistrement.getSelectionModel().select(ParameterController.save);
        TFParametresPseudo.setText(ParameterController.namePlayer);
        paneMenu.toFront();*/
    }

    @FXML
    public void setParametres(ActionEvent event) {
        paneParametres.toFront();
    }

    @FXML
    public void setValiderParametres(ActionEvent event) {
        /*ParameterController.validateParameter(TFParametresPseudo.getText(), CBParametresEnregistrement.getSelectionModel().getSelectedItem());
        paneMenu.toFront();*/
    }

    @FXML
    public void setHighScore(ActionEvent event) {
        textHighScore.setText(Integer.toString(highScore));
        paneHighScore.toFront();
    }

    @FXML
    public void setJouer(ActionEvent event) {
        textDe1.setText("0");
        textDe2.setText("0");
        textLancer.setText("0");
        textScore.setText("0");
        GameController.launchGame();
        paneJouer.toFront();
    }
}

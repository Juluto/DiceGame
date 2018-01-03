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

import java.net.URL;
import java.util.ResourceBundle;

public class FrontOffice implements Initializable {

    private String namePlayer = "Player";
    private String save = "XML";
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

        TFParametresPseudo.setText(namePlayer);

        textHighScore.setText(Integer.toString(highScore));
    }

    @FXML
    public void setFrontPaneMenu(ActionEvent event) {
        CBParametresEnregistrement.getSelectionModel().select(save);
        TFParametresPseudo.setText(namePlayer);
        paneMenu.toFront();
    }

    @FXML
    public void setParametres(ActionEvent event) {
        paneParametres.toFront();
    }

    @FXML
    public void setValiderParametres(ActionEvent event) {
        this.namePlayer = TFParametresPseudo.getText();
        this.save = CBParametresEnregistrement.getSelectionModel().getSelectedItem();
        paneMenu.toFront();
    }

    @FXML
    public void setHighScore(ActionEvent event) {
        textHighScore.setText(Integer.toString(highScore));
        paneHighScore.toFront();
    }
}

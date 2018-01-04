package m2.miage.dicegame.controleur;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import m2.miage.dicegame.Main.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class ParameterController implements Initializable {

    private Main apps;

    private static String namePlayer = "Player";
    private static String save = "XML";

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

    public ParameterController() {
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
        TFParametresPseudo.setText(namePlayer);
        CBParametresEnregistrement.getItems().removeAll(CBParametresEnregistrement.getItems());
        CBParametresEnregistrement.getItems().addAll("XML", "JSON");
        CBParametresEnregistrement.getSelectionModel().select(save);
    }

    @FXML
    public void setValiderParametres(ActionEvent event) {
        namePlayer = TFParametresPseudo.getText();
        save = CBParametresEnregistrement.getSelectionModel().getSelectedItem();
        apps.menuView();
    }

    @FXML
    public void setAnnuler(ActionEvent event) {
        apps.menuView();
    }


    public static String getNamePlayer() {
        return namePlayer;
    }

    public static void setNamePlayer(String namePlayer) {
        ParameterController.namePlayer = namePlayer;
    }

    public static String getSave() {
        return save;
    }

    public static void setSave(String save) {
        ParameterController.save = save;
    }
}

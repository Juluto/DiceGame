package m2.miage.dicegame.controleur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import m2.miage.dicegame.Main.Main;
import m2.miage.dicegame.modele.Player;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ParameterController implements Initializable {

    private static String namePlayer = "Player";
    private static String save = "XML";

    /*public static String namePlayer = "Player";
    public static String save = "XML";

    public static void validateParameter(String namePlayerModified, String saveModified){
        namePlayer = namePlayerModified;
        save = saveModified;
    }*/

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TFParametresPseudo.setText(namePlayer);
        CBParametresEnregistrement.getItems().removeAll(CBParametresEnregistrement.getItems());
        CBParametresEnregistrement.getItems().addAll("XML", "JSON");
        CBParametresEnregistrement.getSelectionModel().select("XML");
    }

    @FXML
    public void setValiderParametres(ActionEvent event) {
        namePlayer = TFParametresPseudo.getText();
        save = CBParametresEnregistrement.getSelectionModel().getSelectedItem();
        //paneMenu.toFront();
    }

    @FXML
    public void setAnnuler(ActionEvent event) {

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

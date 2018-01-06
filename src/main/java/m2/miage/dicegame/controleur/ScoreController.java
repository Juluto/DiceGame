package m2.miage.dicegame.controleur;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import m2.miage.dicegame.Main.Main;
import m2.miage.dicegame.modele.Entry;

import java.net.URL;
import java.util.ResourceBundle;

public class ScoreController implements Initializable {

    private Main apps;

    private static ObservableList<Entry> dataEntry = FXCollections.observableArrayList();

    @FXML
    private TableView<Entry> tableJouer;
    @FXML
    private TableColumn<Entry, String> colJoueur;
    @FXML
    private TableColumn<Entry, String> colScore;
    @FXML
    private Button buttonScoreRetour;


    public ScoreController() {
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
        colJoueur.setCellValueFactory(new PropertyValueFactory("name"));
        colScore.setCellValueFactory(new PropertyValueFactory("score"));
        tableJouer.setItems(ScoreController.getDataEntry());
    }

    @FXML
    public void setScoreRetour(ActionEvent event) {
        apps.menuView();
    }

    public static ObservableList<Entry> getDataEntry() {
        return dataEntry;
    }

    public static void setDataEntry(ObservableList<Entry> dataEntry) {
        ScoreController.dataEntry = dataEntry;
    }
}

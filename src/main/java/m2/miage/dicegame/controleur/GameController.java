package m2.miage.dicegame.controleur;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import m2.miage.dicegame.Main.Main;
import m2.miage.dicegame.modele.*;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    private Main apps;
    private DiceGame diceGame;



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
    @FXML
    private Text textJoueur;
    @FXML
    private Text etatJeu;
    @FXML
    private ImageView imgDie1;
    @FXML
    private ImageView imgDie2;
    @FXML
    private ListView<String> tableJouer;


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
        imgDie1.setImage(new Image(getClass().getResource("/img/dieFace1.png").toExternalForm()));
        textDe2.setText("0");
        imgDie2.setImage(new Image(getClass().getResource("/img/dieFace1.png").toExternalForm()));
        textLancer.setText("0");
        textScore.setText("0");
        textJoueur.setText(ParameterController.getNamePlayer());

        diceGame = new DiceGame();
        diceGame.start(ParameterController.getNamePlayer());

        buttonLancer.setDisable(false);
        etatJeu.setText("");

        tableJouer.setItems(ScoreController.getDataEntry());
    }

    @FXML
    public void lancerDes(ActionEvent event) {
        diceGame.getDie1().roll();
        diceGame.getDie2().roll();
        textDe1.setText(Integer.toString(diceGame.getDie1().getFaceValue()));
        imgDie1.setImage(new Image(getClass().getResource(diceGame.getDie1().imgDie()).toExternalForm()));
        textDe2.setText(Integer.toString(diceGame.getDie2().getFaceValue()));
        imgDie2.setImage(new Image(getClass().getResource(diceGame.getDie2().imgDie()).toExternalForm()));
        if (diceGame.getDie1().getFaceValue() + diceGame.getDie2().getFaceValue() == 7) {
            diceGame.getPlayer().setScore(diceGame.getPlayer().getScore() + 10);
        }
        textScore.setText(Integer.toString(diceGame.getPlayer().getScore()));
        diceGame.setNbLancer(diceGame.getNbLancer() + 1);
        textLancer.setText(Integer.toString(diceGame.getNbLancer()));
        if (diceGame.getNbLancer() == 10) {
            buttonLancer.setDisable(true);
            Entry entry = new Entry(diceGame.getPlayer().getName(), diceGame.getPlayer().getScore());
            ScoreController.getDataEntry().add(entry.toString());
            /*if (diceGame.getPlayer().getScore() > HighScoreController.getHighScore().getScore()) {
                HighScore.getInstance().add(entry);
            }*/
            etatJeu.setText("Partie terminée !");
        }
    }

    @FXML
    public void quitterJeu(ActionEvent event) {
        apps.menuView();
    }
}

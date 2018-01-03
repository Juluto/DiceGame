package m2.miage.dicegame.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import m2.miage.dicegame.IHM.FrontOffice;
import m2.miage.dicegame.modele.Player;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {

    private Stage primaryStage;
    private static ArrayList<Player> namePlayers = new ArrayList<Player>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("DiceGame");
        Parent root = null;
        FrontOffice frontOffice = new FrontOffice();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../../../../resources/FrontOffice/FrontOffice.fxml"));
        loader.setController(frontOffice);
        try {
            root = loader.load();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        frontOffice.setMain(this);
        Scene scene = new Scene(root);

        this.primaryStage.setScene(scene);
        this.primaryStage.show();

    }

    public static ArrayList<Player> getNamePlayers() {
        return namePlayers;
    }

    public static void addPlayer(Player player) {
        namePlayers.add(player);
    }
}

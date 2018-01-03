package m2.miage.dicegame.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import m2.miage.dicegame.IHM.FrontOffice;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;

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

}

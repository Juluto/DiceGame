package m2.miage.dicegame.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import m2.miage.dicegame.IHM.FrontOffice;
import m2.miage.dicegame.controleur.MenuController;

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
        menu();
        /*Parent root = null;
        MenuController menuController = new MenuController();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FrontOffice/Menu.fxml"));
        loader.setController(menuController);
        try {
            root = loader.load();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        menuController.setView(this);
        Scene scene = new Scene(root);

        this.primaryStage.setScene(scene);
        this.primaryStage.show();*/

    }

    public void menu() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FrontOffice/Menu.fxml"));
        try {
            Parent root = (Parent) loader.load();
            MenuController menuController = (MenuController)loader.getController();
            menuController.setView(this);
            this.primaryStage.setScene(new Scene(root));
            this.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

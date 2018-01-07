package m2.miage.dicegame.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import m2.miage.dicegame.controleur.*;

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
        menuView();
    }

    public void menuView() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FrontOffice/Menu.fxml"));
        try {
            Parent root = (Parent) loader.load();
            MenuController menuController = (MenuController) loader.getController();
            menuController.setView(this);
            this.primaryStage.setScene(new Scene(root));
            this.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void parametersView() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FrontOffice/Parameters.fxml"));
        try {
            Parent root = (Parent) loader.load();
            ParameterController parameterController = (ParameterController) loader.getController();
            parameterController.setView(this);
            this.primaryStage.setScene(new Scene(root));
            this.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void highScoreView() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FrontOffice/HighScore.fxml"));
        try {
            Parent root = (Parent) loader.load();
            HighScoreController highScoreController = (HighScoreController) loader.getController();
            highScoreController.setView(this);
            this.primaryStage.setScene(new Scene(root));
            this.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void gameView() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FrontOffice/Game.fxml"));
        try {
            Parent root = (Parent) loader.load();
            GameController gameController = (GameController) loader.getController();
            gameController.setView(this);
            this.primaryStage.setScene(new Scene(root));
            this.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void scoreView() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FrontOffice/Score.fxml"));
        try {
            Parent root = (Parent) loader.load();
            ScoreController scoreController = (ScoreController) loader.getController();
            scoreController.setView(this);
            this.primaryStage.setScene(new Scene(root));
            this.primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

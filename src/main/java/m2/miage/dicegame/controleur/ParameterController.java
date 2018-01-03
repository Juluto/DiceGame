package m2.miage.dicegame.controleur;

import m2.miage.dicegame.Main.Main;
import m2.miage.dicegame.modele.Player;

import java.util.ArrayList;

public class ParameterController {

    public static String namePlayer = "Player";
    public static String save = "XML";

    public static void validateParameter(String namePlayerModified, String saveModified){
        namePlayer = namePlayerModified;
        save = saveModified;
    }
}

package m2.miage.dicegame.controleur;

import m2.miage.dicegame.Main.Main;
import m2.miage.dicegame.modele.Player;

import java.util.ArrayList;

public class ParameterController {

    public static String namePlayer = "Player";
    public static String save = "XML";

    public static void validateParameter(String namePlayerModified, String saveModified){
        ArrayList<Player> listPlayers = Main.getNamePlayers();
        boolean userAlreadyExist = false;
        for(int i = 0; i < listPlayers.size(); i++)
        {
            if(listPlayers.get(i).getName().equals(namePlayerModified)){
                userAlreadyExist = true;
            }
        }
        if(!userAlreadyExist){
            Player newPlayer = new Player(namePlayerModified);
            Main.addPlayer(newPlayer);
        }
        namePlayer = namePlayerModified;
    }
}

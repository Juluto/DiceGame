package m2.miage.dicegame.modele;

import java.util.Observable;
import java.util.Random;

public class Die extends Observable {

    private int faceValue = 1;
    private final int minValue = 1;
    private final int maxValue = 6;

    public Die() {
        this.faceValue = 1;
    }

    public void roll() {
        Random r = new Random();
        int value = minValue + r.nextInt(maxValue - minValue + 1);
        faceValue = value;
    }

    public String imgDie() {
        switch (this.faceValue){
            case 1:
                return "/img/dieFace1.png";
            case 2:
                return "/img/dieFace2.png";
            case 3:
                return "/img/dieFace3.png";
            case 4:
                return "/img/dieFace4.png";
            case 5:
                return "/img/dieFace5.png";
            case 6:
                return "/img/dieFace6.png";
        }
        return null;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
}

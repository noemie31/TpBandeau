package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class Scenario {
    private ArrayList<EffetAnimation> effects = new ArrayList<EffetAnimation>();

    public Scenario ajouteEffet(EffetAnimation e) {
        this.effects.add(e);
        return this;
    }
    public Scenario ajouteEffetsMulti(EffetAnimation e,int rep) {
        for (int i = 0; i < rep; i++) {
            this.ajouteEffet(e);
        }
        return this;
    }

    public void run() {
        for (EffetAnimation e : effects) {
            e.execute();
        }
    }


    public static void main(String[] args) {

        Scenario scenario = new Scenario();
        Bandeau monBandeau = new Bandeau();
        monBandeau.setFont(new Font("SansSerif", Font.BOLD, 15));
        scenario.ajouteEffet(new ChangerCouleurFond(monBandeau,0,"Changement fond",Color.MAGENTA,Color.YELLOW));
        scenario.ajouteEffet(new Tourner(monBandeau, 1000, "Tourner", 90,1000, Color.MAGENTA,Color.YELLOW));
        scenario.ajouteEffet(new Tourner(monBandeau, 1000, "Tourner", 180,1000, Color.MAGENTA,Color.YELLOW));
        scenario.ajouteEffet(new Tourner(monBandeau, 1000, "Tourner", 0,1000, Color.MAGENTA,Color.YELLOW));
        scenario.ajouteEffetsMulti(new Zoom(monBandeau, 1000, "Zoom....",15, 2, 1000,Color.MAGENTA,Color.YELLOW),2);
        scenario.ajouteEffet(new ChangerCouleurFond(monBandeau,0,"fond noir",Color.BLACK,Color.WHITE));
        scenario.run();
    }



}
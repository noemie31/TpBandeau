package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Tourner extends EffetAnimation{
    private String texte;
    private int angle;
    private int duration;
    private Color colorfond;
    private Color colortexte;

    public Tourner(Bandeau bandeau, int delais, String texte, int angle,int duration, Color colorfond,Color colortexte){
        super(bandeau,delais);
        this.texte=texte;
        this.angle=angle;
        this.duration=duration;
        this.colorfond=colorfond;
        this.colortexte=colortexte;
    }

    @Override
    public void execute() {
        bandeau.setBackground(colortexte);
        bandeau.setForeground(colorfond);
        this.bandeau.sleep(this.delais);
        this.bandeau.setMessage(texte);
        bandeau.setRotation(angle);
        bandeau.sleep(duration);
    }

}

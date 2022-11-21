package exemple;
import bandeau.Bandeau;

import java.awt.*;

public class Zoom extends EffetAnimation{
    private String texte;
    private int duration;
    private int factor;
    private int base;
    private Color colorfond;
    private Color colortexte;

    public Zoom(Bandeau bandeau, int delay, String texte,int base, int factor, int duration,Color colorfond,Color colortexte) {
        super(bandeau, delay);
        this.texte = texte;
        this.duration = duration;
        this.factor = factor;
        this.base = base;
        this.colorfond=colorfond;
        this.colortexte=colortexte;
    }

    @Override
    public void execute() {
        bandeau.setBackground(colortexte);
        bandeau.setForeground(colorfond);
        this.bandeau.sleep(this.delais);
        this.bandeau.setMessage(texte);
        for (int i = base; i < 60; i += factor) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            bandeau.sleep(100);
        }
        bandeau.sleep(duration);

    }
}

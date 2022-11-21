package exemple;

import bandeau.Bandeau;
import java.awt.Color;

public class ChangerCouleurFond extends EffetAnimation{
    private String texte;
    private Color colorfond;
    private Color colortexte;

    public ChangerCouleurFond(Bandeau bandeau,int delais, String texte, Color colorfond,Color colortexte) {
        super(bandeau, delais);
        this.texte = texte;
        this.colorfond = colorfond;
        this.colortexte = colortexte;
    }
    @Override
    public void execute() {
        this.bandeau.sleep(this.delais);
        this.bandeau.setMessage(texte);
        this.bandeau.setForeground(colortexte);
        this.bandeau.setBackground(colorfond);
    }

}

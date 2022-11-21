package exemple;

import bandeau.Bandeau;

public abstract class EffetAnimation {
    protected int delais;
    protected Bandeau bandeau;

    public EffetAnimation(Bandeau bandeau,int delais) {
        this.bandeau = bandeau;
        this.delais = delais;
    }

    public abstract void execute();
}

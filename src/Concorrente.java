
import java.awt.Color;

/**
 *
 * @author personal
 */
public class Concorrente {
    private Color colore;
    private int posizioneX;

    public Concorrente(Color colore, int posizioneX) {
        this.colore = colore;
        this.posizioneX = posizioneX;
    }

    public Color getColore() {
        return colore;
    }

    public void setPosizioneX(int posizioneX) {
        this.posizioneX = posizioneX;
    }

    public int getPosizioneX() {
        return posizioneX;
    }
    
    public void incrementaPosizioneX (int incremento) {
        posizioneX += incremento;
    }  
}
